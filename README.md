# オヌルドゥテム (DTEM)

中古品取引プラットフォーム「オヌルドゥテム」のバックエンドアプリケーションです。

## プロジェクト概要

本プロジェクトは、ユーザー間での安全で効率的な中古品取引を実現するためのWebアプリケーションです。リアルタイムチャット、商品管理、レビューシステムなどの機能を提供します。

### 主な機能

- **ユーザー管理機能**
  - 会員登録・ログイン・ログアウト
  - プロフィール管理（プロフィール画像、自己紹介）
  - マイページ（販売履歴、購入履歴、評価）
  - メール認証によるアカウント確認
  - ID・パスワード検索

- **商品管理機能**
  - 商品登録・編集・削除
  - 商品検索・フィルタリング
  - カテゴリ別分類
  - 地域別表示
  - お気に入り機能（いいね機能）

- **チャット機能**
  - WebSocketを使用したリアルタイムチャット
  - チャットルーム管理
  - 取引相手とのメッセージ交換

- **取引管理**
  - 取引状態管理（交渉中、取引完了）
  - 取引履歴の記録

- **レビューシステム**
  - 取引完了後のレビュー投稿
  - ユーザー評価システム

## 🛠️ 使用技術スタック

### バックエンド
- **言語**: Java 17
- **フレームワーク**: Spring Boot 3.5.6
- **ORM**: Spring Data JPA (Hibernate)
- **データベース**: Oracle Database
- **ビルドツール**: Gradle

### フロントエンド
- **テンプレートエンジン**: Thymeleaf
- **JavaScript**: Vanilla JavaScript
- **CSS**: HTML内蔵スタイル

### その他
- **リアルタイム通信**: Spring WebSocket
- **メール送信**: Spring Mail (Gmail SMTP)
- **ファイルアップロード**: Spring Multipart
- **ロギング**: Logback
- **開発支援**: Lombok

## プロジェクト構造

```
src/main/java/com/example/dtem/
├── config/          # 設定クラス（WebSocket、セキュリティなど）
├── controller/     # コントローラー（Webリクエスト処理）
│   ├── ChatController.java
│   ├── ChatRestController.java
│   ├── IndexController.java
│   ├── PostController.java
│   └── UserController.java
├── dao/            # データアクセスオブジェクト（Repositoryラッパー）
├── dto/            # データ転送オブジェクト
├── entity/         # JPAエンティティ（データベーステーブルマッピング）
│   ├── Users.java
│   ├── Posts.java
│   ├── ChatRoom.java
│   ├── ChatMessage.java
│   ├── Trade.java
│   └── Review.java
├── repository/     # JPA Repositoryインターフェース
├── service/        # ビジネスロジックサービス
│   ├── UserService.java
│   ├── PostService.java
│   ├── ChatService.java
│   ├── TradeService.java
│   └── ReviewService.java
└── scheduler/      # スケジューラー（定期実行タスク）
```

主なテーブル：

- `users` - ユーザー情報
- `posts` - 商品情報
- `post_category` - 商品カテゴリ
- `post_location` - 地域情報
- `post_image` - 商品画像
- `post_like` - お気に入り
- `chat_room` - チャットルーム
- `chat_message` - チャットメッセージ
- `trade` - 取引情報
- `review` - レビュー情報

