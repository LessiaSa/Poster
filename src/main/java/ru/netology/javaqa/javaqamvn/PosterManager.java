package ru.netology.javaqa.javaqamvn;

public class PosterManager {
    private String[] posters = new String[0];
    private int size;


    public PosterManager() {
       this.size = 7;
    }

    public PosterManager(int size) {
        this.size = size;
    }

    public String[] getPosters() {
        return posters;
    }

    public int getSize() {
        return size;
    }

    public void addPoster(String poster) {
        String[] films = new String[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            films[i] = posters[i];
        }
        films[films.length - 1] = poster;
        posters = films;
    }

    public String[] findAll() {
        return posters;
    }

    public String[] findLast() {
        int resultLength;
        if (posters.length<size) {
            resultLength = posters.length;
        } else {
            resultLength = size;
        }
        String[] answer = new String[resultLength];
        for (int i = 0;i < answer.length;i++) {
            answer[i] =posters[posters.length -1-i];
        }
        return answer;
    }
}


