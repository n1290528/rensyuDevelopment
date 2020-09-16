package jp.ac.isc.cloud;

/* ヘルパークラスはオブジェクト生成をしなくても使用できるようにしたいため、final句を付けてオブジェクト生成を抑制する*/
public final class SentenceHelper {
	/* ヘルパークラスはすべてstaticメソッドなので、なにもしないprivateのコントラクタを用意して、外部からの
	 * オブヘクト生成を抑制する*/
	private SentenceHelper() { /* なにもしない */}

	/* ランダムな文章を作るための素材を用意する*/
	private static final String[] whenList = {"さっき","昨日", "あれはもう3年も昔","紀元前","ジュラ紀"};
	private static final String[] whereList = {"自宅で","近くの居酒屋で","世界のまんなかで","追い込み中のプロジェクトで","木星で"};
	private static final String[] whoList = {"わたしが","あなたが","オヤジが","あこがれのアイドルが","紙が"};
	private static final String[] whatList = {"新しいソートアルゴリズムを発見した","イグノーベル賞を受賞した","悟りを開いた","こけた","十円ひろった"};

	/* 新しい文章を作成する*/
	public static String makeSentence(String when,String where,String who,String what) {
		StringBuilder builder = new StringBuilder();
		builder.append("".equals(when) ? choice(whenList):when).append("");
		builder.append("".equals(where) ? choice(whereList):where).append("");
		builder.append("".equals(who) ? choice(whoList):who).append("");
		builder.append("".equals(what) ? choice(whatList):what).append("");
		return builder.toString();
	}

	private static String choice(String[] list) {
		return list[(int)(Math.random() * list.length)];
	}
}
