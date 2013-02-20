$(function(){

    _.templateSettings = {
        interpolate : /\{\{(.+?)\}\}/g,
        evaluate : /\{!(.+?)!\}/g
    };

  // Article Model
  window.Article = Backbone.Model.extend({

    // Default attributes
    defaults: function() {
      return {
        title:  ""
      };
    }

  });

  // Article Collection
  // ---------------
  window.ArticleList = Backbone.Collection.extend({

    // Reference to this collection's model.
    model: Article,

    url: 'articles',

    // Articles are sorted by their publishDate, newest at the top
    comparator: function(article) {
      var date = new Date(article.get('publishDate'));
      return -date.getTime();
    }

  });

  // Create our global collection of **Articles**.
  window.Articles = new ArticleList;

  // Article Item View
  // --------------

  // The DOM element for an article item...
  window.ArticleView = Backbone.View.extend({

    //... is a list tag.
    tagName:  "li",

    // Cache the template function for a single item.
    template: _.template($('#article-template').html()),

    // The DOM events specific to an item.
    events: {
      
    },

    // The ArticleView listens for changes to its model, re-rendering.
    initialize: function() {
      this.model.bind('change', this.render, this);
    },

    // Re-render the contents of the todo item.
    render: function() {
      $(this.el).html(this.template(this.model.toJSON()));
      this.setArticleContents();
      return this;
    },

    
    setArticleContents: function() {
      var text = this.model.get('title');
      var imageURL = this.model.get('imageURL');

      this.$('.article-title>a').text(text);
      var dateStr = (this.model.get('publishDate')).toString('EEE, d MMM yyyy');
      this.$('.publish-date').text(dateStr);
      
      this.$('a.article-link').attr('href', 'article/' + this.model.get('id'));
      this.$('.article-img').attr('src',imageURL);
      this.$('.article').addClass('flipInX');
      
    },
    /*
    // Toggle the `"done"` state of the model.
    toggleDone: function() {
      this.model.toggle();
    },

    // Switch this view into `"editing"` mode, displaying the input field.
    edit: function() {
      $(this.el).addClass("editing");
      this.input.focus();
    },

    // Close the `"editing"` mode, saving changes to the todo.
    close: function() {
      this.model.save({text: this.input.val()});
      $(this.el).removeClass("editing");
    },

    // If you hit `enter`, we're through editing the item.
    updateOnEnter: function(e) {
      if (e.keyCode == 13) this.close();
    },

    // Remove this view from the DOM.
    remove: function() {
      $(this.el).remove();
    },

    // Remove the item, destroy the model.
    clear: function() {
      this.model.destroy();
    }*/

  });

  // The Application
  // ---------------

  // Our overall **AppView** is the top-level piece of UI.
  window.AppView = Backbone.View.extend({

    // Instead of generating a new element, bind to the existing skeleton of
    // the App already present in the HTML.
    el: $("#magazineapp"),


    // Delegated events for creating new items, and clearing completed ones.
    events: {
      
    },

    initialize: function() {

      Articles.bind('add',   this.addOne, this);
      Articles.bind('reset', this.addAll, this);
      Articles.bind('all',   this.render, this);

      Articles.fetch();
    },

    
    // Add a single article to the list by creating a view for it, and
    // appending its element to the `<ul>`.
    addOne: function(article) {
      var view = new ArticleView({model: article});
      $("#article-list").append(view.render().el);
    },

    // Add all items in the **Articles** collection at once.
    addAll: function() {
      Articles.each(this.addOne);
    },

  });

  // Finally, we kick things off by creating the **App**.
  window.App = new AppView;

});