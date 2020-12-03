class Account {
  String _id;
  String _accountId;
  String _puuid;
  String _name;
  int _profileIconId;
  int _revisionDate;
  int _summonerLevel;

  Account(
      {String id,
      String accountId,
      String puuid,
      String name,
      int profileIconId,
      int revisionDate,
      int summonerLevel}) {
    this._id = id;
    this._accountId = accountId;
    this._puuid = puuid;
    this._name = name;
    this._profileIconId = profileIconId;
    this._revisionDate = revisionDate;
    this._summonerLevel = summonerLevel;
  }

  String get id => _id;
  set id(String id) => _id = id;
  String get accountId => _accountId;
  set accountId(String accountId) => _accountId = accountId;
  String get puuid => _puuid;
  set puuid(String puuid) => _puuid = puuid;
  String get name => _name;
  set name(String name) => _name = name;
  int get profileIconId => _profileIconId;
  set profileIconId(int profileIconId) => _profileIconId = profileIconId;
  int get revisionDate => _revisionDate;
  set revisionDate(int revisionDate) => _revisionDate = revisionDate;
  int get summonerLevel => _summonerLevel;
  set summonerLevel(int summonerLevel) => _summonerLevel = summonerLevel;

  Account.fromJson(Map<String, dynamic> json) {
    _id = json['id'];
    _accountId = json['accountId'];
    _puuid = json['puuid'];
    _name = json['name'];
    _profileIconId = json['profileIconId'];
    _revisionDate = json['revisionDate'];
    _summonerLevel = json['summonerLevel'];
  }

  Map<String, dynamic> toJson() {
    final Map<String, dynamic> data = new Map<String, dynamic>();
    data['id'] = this._id;
    data['accountId'] = this._accountId;
    data['puuid'] = this._puuid;
    data['name'] = this._name;
    data['profileIconId'] = this._profileIconId;
    data['revisionDate'] = this._revisionDate;
    data['summonerLevel'] = this._summonerLevel;
    return data;
  }
}