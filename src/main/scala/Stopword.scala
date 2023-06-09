package main

object Stopword {
    val stopwords = List(
        "フォロー",
        "ちゃん",
        "お願い",
        "ください",
        "可愛い",
        "くらい",
        "ござい",
        "ありがとう",
        "ながら",
        "www",
        "よろしく",
        "嬉しい",
        "なかっ",
        "...",
        "！　#",
        "ところ",
        "ある程度",
        "バンド",
        "そして",
        "\uD83D\uDE2D\uD83D",
        "おちん",
        "どちら",
        "ほんと",
        "みんな",
        "よかっ",
        "本当に",
        "なんか",
        "みたい",
        "めっちゃ",
        "できる",
        "楽しみ",
        "という",
        "ましょ",
        "初めて",
        "100",
        "ずっと",
        "お迎え",
        "LINE",
        "なんて",
        "カラダ",
        "たくさん",
        "アカウント",
        "皆さん",
        "フォロワー",
        "こんな",
        "こちら",
        "おめでとう",
        "しまっ",
        "繋がり",
        "すみません",
        "詳しい",
        "下がら",
        "一昨日",
        "はじめ",
        "「...(",
        "パーティ",
        "ザドッ",
        "ばっか",
        "ちゃっかり",
        "あらし",
        "マジギレ",
        "ちゃんと",
        "続ける",
        "久しぶり",
        "プレゼント",
        "LIVE",
        "しかも",
        "あなた",
        "___",
        "セット",
        "ファン",
        "当たり",
        "かわいい",
        "ことば",
        "あたり",
        "良かっ",
        "生まれ",
        "リング",
        "ゲーム",
        "仲良く",
        "上がっ",
        "欲しい",
        "https",
        "キラキラ",
        "仲良く",
        "love",
        "あなた",
        "サイト",
        "000",
        "バイト",
        "いえいえ",
        "そういう",
        "ダンス",
        "そっくり",
        "コメント",
        "フォロバ",
        "わから",
        "メンバー",
        "キャラ",
        "とても",
        "ちゃっ",
        "欲しい",
        "やすい",
        "宜しく",
        "bot",
        "ライブ",
        "いやいや",
        "･･･",
        "そんな",
        "わかっ",
        "として",
        "らしい",
        "ほしい",
        "ありがと",
        "くれる",
        "キャス",
        " ̥̥̥̥̥̥̥̥",
        "下さっ",
        "@__",
        "Tシャツ",
        "リフォロー",
        "anime",
        "カード",
        "マシュ",
        "お客様",
        "お知らせ",
        "かっこいい",
        "メール",
        "ごめん",
        "tan",
        "っぽい",
        "終わっ",
        "レベル",
        "リクエスト",
        "ちょっと",
        "意外と",
        "なかなか",
        "優しく",
        "やっと",
        "すごい",
        "リツイート",
        "大好き",
        "アニメ",
        "いただき",
        "ツイート",
        "面白い",
        "とりあえず",
        "ガチャ",
        "これから",
        "頑張っ",
        "わかる",
        "やっぱり",
        "正しい",
        "がんばろ",
        "ドキドキ",
        "アプリ",
        "すぎる",
        "そもそも",
        "シーン",
        "気づい",
        "悲しく",
        "アルバ",
        "わたし",
        "でしょ",
        "おねがい",
        "ちゃう",
        "そろそろ",
        "やばい",
        "たかい",
        "おまえ",
        "……",
        "ーーー",
        "られる",
        "アウト",
        "分から",
        "すごく",
        "まさか",
        "しまい",
        "ジャー",
        "もちろん",
        "どうぞ",
        "epGlZYmuFL",
        "313",
        ":【# ",
        "大丈夫",
        "アップ",
        "747",
        "終わる",
        "saya",
        "^)／＼(^",
        "いっぱい",
        "アアアアアアアアアアア",
        "だから"
    )

    def notContains(word: String): Boolean = {
        return !stopwords.contains(word)
    }
}
