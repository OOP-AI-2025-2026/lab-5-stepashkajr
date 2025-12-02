package main.java.ua.opnu;

    public class TimeSpan {
        private int hours;
        private int minutes;

        public TimeSpan(){
            hours = 0;
            minutes = 0;
        }

        public TimeSpan(int minutes){
            if(minutes < 0 || minutes > 59){
                this.minutes = 0;
            } else {
                this.minutes = minutes;
            }
        }

        public TimeSpan(int hours, int minutes) {
            if(hours < 0){
                this.hours = 0;
            } else {
                this.hours = hours;
            }
            if(minutes < 0 || minutes > 59){
                this.minutes = 0;
            } else {
                this.minutes = minutes;
            }
        }

        public  TimeSpan(TimeSpan timespan){
            this.hours = timespan.getHours();
            this.minutes = timespan.getMinutes();
        }

        public int getHours() {
            return hours;
        }

        public int getMinutes() {
            return minutes;
        }

        public void add(int minutes) {
            if(minutes > 0) {
                this.minutes += minutes;
            }
            if(this.minutes >= 60) {
                int hoursAdded = this.minutes / 60;
                this.hours += hoursAdded;
                this.minutes = (this.minutes - (hoursAdded * 60));
            }
        }

        public void add(int hours, int minutes) {
            if(hours > 0) {
                this.hours += hours;
            }
            add(minutes);
        }

        public void addTimeSpan(TimeSpan timespan) {
            add(timespan.getHours(), timespan.getMinutes());
        }

        public double getTotalHours() {
            return ((double)(getHours()*60) + getMinutes())/60;
        }

        public  int getTotalMinutes() {
            return (getHours()*60) + getMinutes();
        }

        public void subtract(int hours, int minutes) {
            int changeTime = (hours*60) + minutes;
            subtract(changeTime);
        }

        public void subtract(int minutes) {
            int currentTime = (getHours()*60) + getMinutes();
            if(currentTime >= minutes){
                int result = currentTime - minutes;
                hours = result/60;
                this.minutes = result - (hours*60);
            }
        }

        public void subtract(TimeSpan span) {
            int timeFirst = (getHours()*60) + getMinutes();
            int timeSecond = (span.getHours()*60) + span.getMinutes();
            if(timeFirst>=timeSecond){
                int result = timeFirst - timeSecond;
                hours = result/60;
                minutes = result - (hours*60);
            }
        }

    }
