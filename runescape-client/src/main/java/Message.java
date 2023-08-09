import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	static IndexedSprite field504;
	@ObfuscatedName("dw")
	static boolean field506;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1911847025
	)
	@Export("count")
	int count;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 642550855
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -884307299
	)
	@Export("type")
	int type;
	@ObfuscatedName("am")
	@Export("sender")
	String sender;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("az")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("av")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 13
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 14
		this.set(var1, var2, var3, var4); // L: 19
	} // L: 20

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "936252808"
	)
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		this.count = class425.method7864(); // L: 23
		this.cycle = Client.cycle; // L: 24
		this.type = var1; // L: 25
		this.sender = var2; // L: 26
		this.fillSenderUsername(); // L: 27
		this.prefix = var3; // L: 28
		this.text = var4; // L: 29
		this.clearIsFromFriend(); // L: 30
		this.clearIsFromIgnored(); // L: 31
	} // L: 32

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "53"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 35
	} // L: 36

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1790809365"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) { // L: 39
			this.fillIsFromFriend(); // L: 40
		}

		return this.isFromFriend0 == TriBool.TriBool_true; // L: 42
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1483847830"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = class177.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 46
	} // L: 47

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-45"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 50
	} // L: 51

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1800868921"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) { // L: 54
			this.fillIsFromIgnored(); // L: 55
		}

		return this.isFromIgnored0 == TriBool.TriBool_true; // L: 57
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-106"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = class177.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 61
	} // L: 62

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1553597211"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) {
			this.senderUsername = new Username(FriendsChatMember.method7947(this.sender), class457.loginType);
		} else {
			this.senderUsername = null;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "18"
	)
	public static int method1241(int var0) {
		return var0 >>> 4 & class509.field5055; // L: 22
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1851914192"
	)
	public static void method1213() {
		class506.DBTableType_cache.clear();
	} // L: 68

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lty;J)V"
	)
	static void method1230(Buffer var0, long var1) {
		var1 /= 10L; // L: 63
		if (var1 < 0L) { // L: 64
			var1 = 0L;
		} else if (var1 > 65535L) { // L: 65
			var1 = 65535L;
		}

		var0.writeShort((int)var1); // L: 66
	} // L: 67
}
