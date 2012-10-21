<!DOCTYPE html>
<html lang="ja">
<head>
	<title>テンプレート${ページごとにテキストが変わります}</title>
	<meta charset="UTF-8" />
	<meta name="description" content="できるまとめサイトです。">
	<meta name="keywords" content="閲覧">
	<link rel="stylesheet" type="text/css" media="screen" href="${f:url('/cssperoperoBase.css')}" charset="utf-8" />
	<link rel="stylesheet" type="text/css" media="screen" href="${f:url('/cssdetailStyle.css')}" charset="utf-8" />
	<!--[if lt IE 9]>
		<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js" type="text/javascript"></script>
	<![endif]-->

	<!--[if lte IE 7]>
		<link href="ie.css" rel="stylesheet" type="text/css" />
	<![endif]-->
	<script type="text/javascript" src="${f:url('/js/jquery.js')}"></script>
	<script type="text/javascript" src="${f:url('/js/toTop.js')}"></script>
	<script type="text/javascript" src="${f:url('/js/linkStyle.js')}"></script>
	<script type="text/javascript" src="${f:url('/js/missing.js')}"></script>
</head>
<body>
	<div id="wrapper">
		<header>
			<div id="inner_header">
				<h1 id ="tagline">ヘアスタイルのまとめサイト|${テキストを変更します。}｜${テキストを変更します。}</h1>

				<div id="logo">
					<p>ロゴ画像</p>
				</div>
			</div>
		</header>
		<nav>
			<div id="inner_nav">
				<div id="naviDiv">
					<ul>
						<li><a href="./">トップページ</a>|</li>
						<li><a href="./">このサイトについて</a>|</li>
						<li><a href="./">リンク</a>|</li>
						<li><a href="./">サイトリンク</a></li>
					</ul>
				</div>
				<div id="searchDiv">
						<form name="" id="searchMovie">
							<p>
								<input type="text" class="search_text"  name="searchForm" />
								<input type="submit" class="search_btr" name="toSearch" value="検索">
							</p>
						</form>
				</div>
			</div>
		</nav>
		<hr />
		<article>
			<div id="inner_content">
				<div id="path_list">
					<p><a href="">トップページ</a>><a href="">お気に入り</a>>${ヘアスタイル名が入ります。}</p>
				</div>
				<div id="detailMain">
					<div id="detailMainBar">
						<h2>${ヘアスタイル名が入ります。}</h2>
					</div>
					<br>
					<div class="detailmovieContents">
						<iframe src="http://flashservice.xvideos.jp/video1753702/quiet_asian_girl_with_awesome_perky_tits_-_www.pornovato.com_" frameborder=0 width="960" height="640" scrolling=no></iframe>
					</div>
				</div>

				<div id="similarStyle">
					<h2><img src="img/similarStyle.png" width="958" height="29" alt="似ているヘアスタイルを探す"></h2>
						<div id="similarPhoto">
						<p>
							<ul>
								<li><img src="img/sampleImage.jpg" alt="ここにヘアスタイル名が入ります。" width="120" height="160"></li>
								<li><img src="img/sampleImage2.jpg" alt="ここにヘアスタイル名が入ります。" width="120" height="160"></li>
								<li><img src="img/sampleImage3.jpg" alt="ここにヘアスタイル名が入ります。" width="120" height="160"></li>
								<li><img src="img/sampleImage.jpg" alt="ここにヘアスタイル名が入ります。" width="120" height="160"></li>
								<li><img src="img/sampleImage2.jpg" alt="ここにヘアスタイル名が入ります。" width="120" height="160"></li>
								<li><img src="img/sampleImage3.jpg" alt="ここにヘアスタイル名が入ります。" width="120" height="160"></li>
								<li><img src="img/sampleImage.jpg" alt="ここにヘアスタイル名が入ります。" width="120" height="160"></li>
							</ul>
						</p>
						</div>
				</div>
			</div>
		</article>
		<footer>
			<div id="inner_footer">
				<div id="footerLeftList">
					<h3><span class="footerDeco">コンテンツ</span></h3>
					<ul>
					<p>
						<li>・<a href="./">サイトトップに戻る</a></li>
						<li>・<a href="./">お気に入りを見る</a></li>
						<li>・<a href="./">人気ランキング</a></li>
					</p>
					</ul>
				</div>
				<div class="footerList">
					<h3><span class="footerDeco">○○について</span></h3>
					<ul>
					<p>
						<li>・<a href="./">本サイトについて</a></li>
						<li>・<a href="./">サイトポリシー</a></li>
						<li>・<a href="./">お問い合わせ</a></li>
						<li>・<a href="./">広告掲載について</a></li>
					</p>
					</ul>
				</div>
				<div class="footerList">
					<h3><span class="footerDeco">おススメサイト</span></h3>
					<ul>
					<p>
						<li>・<a href="./">相互サイトリンク</a></li>
						<li>・<a href="./">アクセスランキング</a></li>
						<li>・<a href="./">広告へのリンク１</a></li>
						<li>・<a href="./">広告へのリンク２</a></li>
					</p>
					</ul>
				</div>
			</div>
				<div id="bottom">
					<p>このサイトはヘアスタルのカタログまとめサイトです。</p>
					<address> Copyright(C)2012 ******  All Rights Reserved</address>
				</div>
		</footer>
	</div>
</body>
</html>
