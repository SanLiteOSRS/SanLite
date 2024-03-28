import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2131922271
	)
	@Export("count")
	int count;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 944255125
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1779775203
	)
	@Export("type")
	int type;
	@ObfuscatedName("at")
	@Export("sender")
	String sender;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lvx;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("aw")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("ad")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 13
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 14
		this.set(var1, var2, var3, var4); // L: 19
	} // L: 20

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "107"
	)
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		this.count = class128.method2995(); // L: 23
		this.cycle = Client.cycle; // L: 24
		this.type = var1; // L: 25
		this.sender = var2; // L: 26
		this.fillSenderUsername(); // L: 27
		this.prefix = var3; // L: 28
		this.text = var4; // L: 29
		this.clearIsFromFriend(); // L: 30
		this.clearIsFromIgnored(); // L: 31
	} // L: 32

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1811233312"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 35
	} // L: 36

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "965333080"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) { // L: 39
			this.fillIsFromFriend(); // L: 40
		}

		return this.isFromFriend0 == TriBool.TriBool_true; // L: 42
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "128"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = class334.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 46
	} // L: 47

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "26"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 50
	} // L: 51

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "452385999"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) { // L: 54
			this.fillIsFromIgnored(); // L: 55
		}

		return this.isFromIgnored0 == TriBool.TriBool_true; // L: 57
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-34"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = class334.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 61
	} // L: 62

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1132603937"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) { // L: 65
			this.senderUsername = new Username(class343.method6309(this.sender), class127.loginType);
		} else {
			this.senderUsername = null; // L: 66
		}

	} // L: 67

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)Ldt;",
		garbageValue = "256"
	)
	static final PendingSpawn method1178(int var0, int var1, int var2, int var3) {
		for (PendingSpawn var4 = (PendingSpawn)Client.pendingSpawns.last(); var4 != null; var4 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8575 8576 8580
			if (var0 == var4.plane && var4.x == var1 && var2 == var4.y && var3 == var4.type) { // L: 8577
				return var4; // L: 8578
			}
		}

		return null; // L: 8582
	}
}
