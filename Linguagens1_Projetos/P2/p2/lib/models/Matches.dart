class Matches {
  String _platformId;
  int _gameId;
  int _champion;
  int _queue;
  int _season;
  int _timestamp;
  String _role;
  String _lane;

  Matches(
      {String platformId,
      int gameId,
      int champion,
      int queue,
      int season,
      int timestamp,
      String role,
      String lane}) {
    this._platformId = platformId;
    this._gameId = gameId;
    this._champion = champion;
    this._queue = queue;
    this._season = season;
    this._timestamp = timestamp;
    this._role = role;
    this._lane = lane;
  }

  String get platformId => _platformId;
  set platformId(String platformId) => _platformId = platformId;
  int get gameId => _gameId;
  set gameId(int gameId) => _gameId = gameId;
  int get champion => _champion;
  set champion(int champion) => _champion = champion;
  int get queue => _queue;
  set queue(int queue) => _queue = queue;
  int get season => _season;
  set season(int season) => _season = season;
  int get timestamp => _timestamp;
  set timestamp(int timestamp) => _timestamp = timestamp;
  String get role => _role;
  set role(String role) => _role = role;
  String get lane => _lane;
  set lane(String lane) => _lane = lane;

  Matches.fromJson(Map<String, dynamic> json) {
    _platformId = json['platformId'];
    _gameId = json['gameId'];
    _champion = json['champion'];
    _queue = json['queue'];
    _season = json['season'];
    _timestamp = json['timestamp'];
    _role = json['role'];
    _lane = json['lane'];
  }

  Map<String, dynamic> toJson() {
    final Map<String, dynamic> data = new Map<String, dynamic>();
    data['platformId'] = this._platformId;
    data['gameId'] = this._gameId;
    data['champion'] = this._champion;
    data['queue'] = this._queue;
    data['season'] = this._season;
    data['timestamp'] = this._timestamp;
    data['role'] = this._role;
    data['lane'] = this._lane;
    return data;
  }
}