'use strict';

/* Controllers */

angular.module('gemStore.controllers', [])

.controller('ReviewController', function() {

	this.review = {};
	this.addReview = function(product) {
		product.reviews.push(this.review);
		this.review = {};
	};

})

.controller('GalleryController', function() {
	this.current = 0;
	this.setCurrent = function(current) {
		this.current = current || 0;
	};
})

.controller('TabController', function() {
	this.tab = 1;
	this.setTab = function(tab) {
		this.tab = tab;
	};
	this.isSet = function(tab) {
		return (this.tab === tab);
	};
})

.controller('StoreController', [ '$http', function($http) {
	var store = this;
	store.products = [];
	$http.get('http://localhost:8080/angularstore.restservice/resttest').success(function(data) {
		store.products = data;
	});
} ]);