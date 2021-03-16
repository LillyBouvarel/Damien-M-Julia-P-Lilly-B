package com.example.jetty_jersey.ws;

import java.util.List;
import java.util.ArrayList;

public class Map {
        public List<Place> placeList;
        public String publisher;
        public Boolean publicOrPrivate;
        public List<User> users;
        
		public List<Place> getPlaceList() {
			return placeList;
		}
		
		
		public void setPlaceList(List<Place> placeList) {
			this.placeList = placeList;
		}
		
		public String getPublisher() {
			return publisher;
		}
		
		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}
		
		public Boolean getPublicOrPrivate() {
			return publicOrPrivate;
		}
		
		public void setPublicOrPrivate(Boolean publicOrPrivate) {
			this.publicOrPrivate = publicOrPrivate;
		}
        
		public Map getMap() {
			Map instance = new Map();
			List<Place> test2 = new ArrayList<Place>();
			instance.placeList = test2;
			instance.publisher = "test2";
			Boolean trueFalse = true;
			instance.publicOrPrivate = trueFalse;
			return instance;
		}
        
		public Map putMap (Place p) {
			this.placeList.add(p);
			return this;
		}
		
		public Map delete(Place p) {
			this.placeList.remove(p);
			return this;
		}
		
		public List<User> putUsers(User u) {
			this.users.add(u);
			return this.users;
		}
		
		public Coordonnees getPlace(Place p) {
			return p.location;
		}
}

