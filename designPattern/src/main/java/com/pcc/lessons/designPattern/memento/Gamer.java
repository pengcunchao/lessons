package com.pcc.lessons.designPattern.memento;

public class Gamer {
    private int blood;
    private int magic;
    private int agile;
    private int aggressivity;

    public void decreaseOne() {
        blood--;
        magic--;
        agile--;
        aggressivity--;
    }

    public boolean isLive() {
        return blood > 0 && magic > 0 && agile > 0 && aggressivity > 0;
    }

    @Override
    public String toString() {
        return "blood: " + blood + ", magic: " + magic + ", agile: " + agile + ", aggressivity: " + aggressivity;
    }

    public Gamer(int blood, int magic, int agile, int aggressivity) {
        this.blood = blood;
        this.magic = magic;
        this.agile = agile;
        this.aggressivity = aggressivity;
    }

    public Memento save() {
        return new Memento(blood, magic, agile, aggressivity);
    }

    public void restore(Memento memento) {
        this.blood = memento.getBlood();
        this.magic = memento.getMagic();
        this.agile = memento.getAgile();
        this.aggressivity = memento.getAggressivity();
    }

    public class Memento {
        private int blood;
        private int magic;
        private int agile;
        private int aggressivity;

        Memento(int blood, int magic, int agile, int aggressivity) {
            this.blood = blood;
            this.magic = magic;
            this.agile = agile;
            this.aggressivity = aggressivity;
        }

        public int getBlood() {
            return blood;
        }

        public int getMagic() {
            return magic;
        }

        public int getAgile() {
            return agile;
        }

        public int getAggressivity() {
            return aggressivity;
        }
    }
}
