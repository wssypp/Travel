//LOADER
$(window).on("load", function() {
    "use strict";
    $(".loader").fadeOut(800);
});

jQuery(function($) {
    "use strict";
/*----------------------------------------------------*/
/*  SEARCH FORM DROPDOWNS
/*----------------------------------------------------*/	
    $(setup)

    function setup() {
        $(".intro select").zelect({})
    }
    var side_drop = $(".push_nav .dropdown");
    side_drop.on("show.bs.dropdown", function(e) {
        $(this).find(".dropdown-menu").first().stop(true, true).slideDown();
    });
    side_drop.on("hide.bs.dropdown", function(e) {
        $(this).find(".dropdown-menu").first().stop(true, true).slideUp();
    });
	// -------  CHECK BOX ------- 
    $('input[name="radio-btn"]').wrap('<div class="radio-btn"><i></i></div>');
    $(".radio-btn").on('click', function() {
        var _this = $(this),
            block = _this.parent().parent();
        block.find('input:radio').attr('checked', false);
        block.find(".radio-btn").removeClass('checkedRadio');
        _this.addClass('checkedRadio');
        _this.find('input:radio').attr('checked', true);
    });
    $('input[name="check-box"]').wrap('<div class="check-box"><i></i></div>');
    $.fn.toggleCheckbox = function() {
        this.attr('checked', !this.attr('checked'));
    }
    $('.check-box').on('click', function() {
        $(this).find(':checkbox').toggleCheckbox();
        $(this).toggleClass('checkedBox');
    });
	
/*----------------------------------------------------*/
/*  FILE UPLOAD
/*----------------------------------------------------*/
if( $('.dropzone').length > 0 ) {
	Dropzone.autoDiscover = false;
	$("#file-submit").dropzone({
		url: "upload",
		addRemoveLinks: true
	});

	$("#profile-picture").dropzone({
		url: "upload",
		addRemoveLinks: true
	});
}
/*----------------------------------------------------*/
/*  SLIDERS
/*----------------------------------------------------*/
$('#recent-listing.owl-carousel').owlCarousel({
    items:1,
    loop:true,
    margin:10,
    nav:true,
	dots : false,
	navText: [
      "<i class='fa fa-angle-left'></i>",
      "<i class='fa fa-angle-right'></i>"
    ],
})
$('#best-thing-slider.owl-carousel').owlCarousel({
    items:1,
    loop:true,
    margin:10,
    nav:true,
	dots : false,
	navText: [
      "<i class='fa fa-angle-left'></i>",
      "<i class='fa fa-angle-right'></i>"
    ],
})

$('#directory-category-slider.owl-carousel').owlCarousel({
    items:5,
    loop:true,
    margin:10,
    nav:true,
	dots : false,
	center : true,
	autoplay:true,
    autoplayTimeout:2000,
    autoplayHoverPause:true,
	navText: [
      "<i class='fa fa-angle-left'></i>",
      "<i class='fa fa-angle-right'></i>"
    ],
	responsive:{
        0:{
            items:1
        },
        480:{
            items:3
        },
        1000:{
            items:4
        },
		1170:{
            items:5
        }
	}
	
})

$('#places-slider.owl-carousel').owlCarousel({
    items:3,
    loop:true,
    margin:10,
    nav:true,
	dots : false,
	center : true,
	autoplay:true,
    autoplayTimeout:2000,
    autoplayHoverPause:true,
	navText: [
      "<i class='fa fa-angle-left'></i>",
      "<i class='fa fa-angle-right'></i>"
    ],
	responsive:{
        0:{
            items:1
        },
        480:{
            items:2
        },
        768:{
            items:3
        }
	}
	
})

$('#latest_news-slider.owl-carousel').owlCarousel({
    items:2,
    loop:true,
    margin:10,
    nav:false,
	dots : true,
	autoplay:true,
    autoplayTimeout:2000,
	responsive:{
        0:{
            items:1
        },
        480:{
            items:2
        }
	}
	
})

/*----------------------------------------------------*/
/*  COUNTER FACT
/*----------------------------------------------------*/
  $(".number-counters").appear(function() {
    $(".number-counters [data-to]").each(function() {
      var e = $(this).attr("data-to");
      $(this).delay(6e3).countTo({
        from: 1,
        to: e,
        speed: 3000,
        refreshInterval: 50
      })
    })
  });

/*----------------------------------------------------*/
/*  GRID SLIDER
/*----------------------------------------------------*/	
$(function() {
	$( '#ri-grid' ).gridrotator( {
		animSpeed : 300,
		w320 : {
			rows : 3,
			columns : 4
		},
		w240 : {
			rows : 3,
			columns : 3
		},
		preventClick : true,
		onhover : true
	} );
});
/*----------------------------------------------------*/
/*  GRID SLIDER
/*----------------------------------------------------*/
jQuery('.package_menu').find('ul').hide();
	jQuery('.package_menu').on('click', '.selected', function(){
		// jQuery(this).parent('.office_menu').find('ul').slideToggle();
		var checkClass = jQuery(this).hasClass('active');
		if(!checkClass){
			jQuery(this).addClass('active');
			jQuery(this).parent('.package_menu').find('ul').slideDown();
		}else{
			jQuery(this).removeClass('active');
			jQuery(this).parent('.package_menu').find('ul').slideUp();
		}
	});
	jQuery('.package_menu').on('click', 'ul a', function(e){
		e.preventDefault();
		jQuery('.addressbox').fadeOut();
		var clickDataVal = jQuery(this).data('office');

		var txt = jQuery(this).html();
		jQuery(this).parents('.package_menu').find('.selected').html(txt);
		jQuery(this).parents('.package_menu').find('.selected').removeClass('active');
		jQuery(this).parents('ul').slideUp();

		jQuery('.addressbox').each( function(){
			var elemDataVal = jQuery(this).data('office');
			if(clickDataVal == elemDataVal){
				jQuery(this).delay(300).fadeIn();
			}
		});
	});	

});
