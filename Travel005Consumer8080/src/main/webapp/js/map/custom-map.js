 $(function(){
            $('#finddo-wrapper').finddo({
                places: [
				
					{title: 'Free Ad', address: ' 57 East 57th Street, New York 10022', url: 'More Details', tags: ['other-services_01'], lat: 51.512279, lng: -0.104649, img: 'images/thumb.png', icon: 'images/icons/marker-other.png'},
					
                    {title: 'Four Seasons Hotel New York', address: ' 57 East 57th Street, New York 10022', url: 'More Details', tags: ['resturent_01'], lat: 51.512279, lng: -0.104649, img: 'images/thumb.png', icon: 'images/icons/marker-hotel.png'},
					
                    {title: 'Double D Discount Motor Spares', address: '3 St Nicholas Ave, Hornchurch RM12 4RH, UK', phone: '+00 123 456 789', url: 'More Details', tags: ['resturent_01'], lat: 51.507632, lng: -0.137779, img: 'images/thumb.png', icon: 'images/icons/marker-hotel.png'},
					
					{title: 'Client Server Ltd', address: '27-32 Old Jewry, London EC2R 8DQ, UK', phone: '+00 123 456 789', url: 'More Details', tags: ['jobs_01'], lat: 51.507632, lng: -0.137779, img: 'images/thumb.png', icon: 'images/icons/marker-jobs.png'},
					
					{title: 'The Cumberland hotel', address: 'Great Cumberland Pl, Marylebone, London W1H 7DL, UK', phone: '+00 123 456 789', url: 'More Details', tags: ['vehicles_01'], lat: 51.507632, lng: -0.137779, img: 'images/thumb.png', icon: 'images/icons/marker-veh.png'},
					
                    {title: ' New Linden Hotel', address: '59 Leinster Square, Kensington and Chelsea, London, W2 4PS, United Kingdom ', phone: '+012 345 678 9', url: 'More Details', tags: ['resturent_01'], lat: 51.504580, lng: -0.082737, img: 'images/thumb.png', icon: 'images/icons/marker-hotel.png'},
					
					{title: 'Lovestruck Dating', address: 'Great Suffolk St, London SE1 0BE, UK', phone: '+012 345 678 9', url: 'More Details', tags: ['dating_01'], lat: 51.504580, lng: -0.082737, img: 'images/thumb.png', icon: 'images/icons/marker-date.png'},
					
                    {title: 'East London Hockey Club', address: '8 Copperfield Rd, London E3 4RT, UK', phone: '+123 456 789', url: 'More Details', tags: ['sport_01','sport_02','sport_03','sport_04'], lat: 51.514633, lng: 0.162566, img: 'images/thumb.png', icon: 'images/icons/marker-sport.png'},
					
                    {title: 'Holiday apartment in Soho', address: 'Brand new 1 bed West End Apartment 4, Soho – Home 6678018', phone: '+123 456 789', url: 'More Details', tags: ['realestate_01','realestate_02','realestate_03','realestate_04','realestate_05','realestate_06'], lat: 51.554888, lng: 0.108419, img: 'images/thumb.png', icon: 'images/icons/marker-realestate.png'},
					
					{title: 'Westfield London', address: 'Ariel Way Shepherd Bush London W12 7GF UK', phone: '+123 456 789', url: 'More Details', tags: ['shoping_01'], lat: 51.554888, lng: 0.108419, img: 'images/thumb.png', icon: 'images/icons/marker-shop.png'},
					
					{title: 'Vittoria Coffee', address: '118 Wetherill St N, Silverwater NSW 2128, Australia', phone: '+123 456 789', url: 'More Details', tags: ['resturent_03'], lat: 51.499479, lng: -0.124809, img: 'images/thumb.png', icon: 'images/icons/marker-cafe.png'},
										
                    {title: 'Restaurant Gordon Ramsay', address: ' 68 Royal Hospital Rd, Chelsea, London SW3 4HP, UK', phone: '+123 45 789', url: 'More Details', tags: ['resturent_02','resturent_02_01'], lat: 51.513845, lng: -0.098351, img: 'images/thumb.png', icon: 'images/icons/marker-rest.png'},
					
					{title: 'Luxury Beauty and Spa', address: '40 Junction Rd, London N19 5RD, UK', phone: '+123 456 789', url: 'More Details', tags: ['beauty_01'], lat: 51.499479, lng: -0.124809, img: 'images/thumb.png', icon: 'images/icons/marker-beauty.png'},
					
					{title: 'Chemical Industries Association', address: ' Kings Buildings, Smith Square, London SW1P 3JJ, United Kingdom', phone: '+123 456 789', url: 'More Details', tags: ['industry_01'], lat: 51.499479, lng: -0.124809, img: 'images/thumb.png', icon: 'images/icons/marker-indus.png'},
					
                    {title: 'Fangweng Restaurant', address: 'Yemingzhu Rd, Xiling Qu, Yichang Shi, Hubei Sheng, China', phone: '+123 456 789', url: 'More Details', tags: ['resturent_02','resturent_02_02'], lat: 51.505456, lng: -0.075356, img: 'images/thumb.png', icon: 'images/icons/marker-rest.png'},
					
                    {title: 'Altitude Restaurant', address: ' Shangri-La Hotel, 176 Cumberland St, Sydney NSW 2000, Australia', phone: '+123 456 789', url: 'More Details', tags: ['resturent_02','resturent_02_03'], lat: 51.499479, lng: -0.124809, img: 'images/thumb.png', icon: 'images/icons/marker-rest.png'},

                ],
                icon: 'images/icons/marker.png',
                lat: 51.5286416,       //latitude of the center
                lng: 0.1015987,       //longitude of the center
                posPanel: 'left',
                showPanel: true,
                radius: 20,
                cluster: true,
                country: 'uk',
                mapType: 'roadmap',
                request: 'large',
                locationTypes: ['geocode','establishment']
            }); 
        });