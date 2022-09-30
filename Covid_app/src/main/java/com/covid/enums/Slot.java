package com.covid.enums;

public enum Slot {
	
	Slot1{
		@Override
		public String timeSlot() {
			return "9:00-9:30";
		}
	},
	Slot2{
		@Override
		public String timeSlot() {
			return "9:30-10:00";
		}
	},
	Slot3{
		@Override
		public String timeSlot() {
			return "10:00-10:30";
		}
	},
	Slot4{
		@Override
		public String timeSlot() {
			return "10:30-11:00";
		}
	},
	Slot5{
		@Override
		public String timeSlot() {
			return "11:00-11:30";
		}
	},
	Slot6{
		@Override
		public String timeSlot() {
			return "11:30-12:00";
		}
	},
	Slot7{
		@Override
		public String timeSlot() {
			return "12:00-12:30";
		}
	},
	Slot8{
		@Override
		public String timeSlot() {
			return "12:30-1:00";
		}
	},
	Slot9{
		@Override
		public String timeSlot() {
			return "1:00-2:30";
		}
	};

	public String timeSlot() {
		return  null;
	}
}
