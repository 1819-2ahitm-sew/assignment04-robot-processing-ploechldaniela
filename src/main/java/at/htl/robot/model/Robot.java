package at.htl.robot.model;

    public class Robot {

        private int x;
        private int y;
        private Direction direction;

        public int getX() {
            return this.x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return this.y;
        }

        public void  setY(int y) {
            this.y = y;
        }

        public Direction getDirection() {
            return this.direction;
        }

        public void  setDirection() {
            this.direction = direction;
        }

        public void stepForward(){
            if (this.direction == Direction.SOUTH){
                y++;
            }
            if (this.direction == Direction.EAST){
                x++;
            }
            if (this.direction == Direction.NORTH){
                y--;
            }
            if (this.direction == Direction.WEST){
                x--;
            }

        }
        public void rotateLeft(){
            if (this.direction == Direction.SOUTH){
                this.direction = Direction.EAST;
            }else if (this.direction == Direction.EAST){
                this.direction = Direction.NORTH;
            }else if (this.direction == Direction.NORTH){
                this.direction = Direction.WEST;
            }else if (this.direction == Direction.WEST){
                this.direction = Direction.SOUTH;
            }
        }
    }




