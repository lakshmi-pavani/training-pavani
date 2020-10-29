class Whatsapp {
    void search(String videos) {
	    System.out.println(" searching whatsapp videos  "+videos);
	}
	
	void search(String videos,String links) {
	    System.out.println("searching whatsapp videos and links  "+videos+ " " +links);
	}
	
	void search(String gifs,String photos,String audios) {
	    System.out.println("searching whatsapp gifs ,photos and audios  "+gifs+ " " +photos+ " " +audios);
	}
}

class Whatsappsearch {
    public static void main(String args[]) {
	    Whatsapp w = new Whatsapp();
		w.search("videos");
		w.search("videos","links");
		w.search("gifs","audios","photos");
	}
}