import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("ta")
	@ObfuscatedGetter(
		intValue = -2024309333
	)
	static int field485;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1273905497
	)
	static int field486;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1665485635
	)
	@Export("count")
	int count;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -489792901
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1931818865
	)
	@Export("type")
	int type;
	@ObfuscatedName("s")
	@Export("sender")
	String sender;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("n")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("l")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 13
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 14
		this.set(var1, var2, var3, var4); // L: 19
	} // L: 20

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1059828352"
	)
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		int var5 = ++Messages.Messages_count - 1; // L: 25
		this.count = var5; // L: 27
		this.cycle = Client.cycle; // L: 28
		this.type = var1; // L: 29
		this.sender = var2; // L: 30
		this.fillSenderUsername(); // L: 31
		this.prefix = var3; // L: 32
		this.text = var4; // L: 33
		this.clearIsFromFriend(); // L: 34
		this.clearIsFromIgnored();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1277277139"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 39
	} // L: 40

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "28"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) { // L: 43
			this.fillIsFromFriend(); // L: 44
		}

		return this.isFromFriend0 == TriBool.TriBool_true; // L: 46
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "330583161"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = WorldMapElement.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 50
	} // L: 51

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-2"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 54
	} // L: 55

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1151238306"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) { // L: 58
			this.fillIsFromIgnored(); // L: 59
		}

		return this.isFromIgnored0 == TriBool.TriBool_true; // L: 61
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = WorldMapElement.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 65
	} // L: 66

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1789118280"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) {
			this.senderUsername = new Username(class6.method48(this.sender), WorldMapCacheName.loginType); // L: 69
		} else {
			this.senderUsername = null; // L: 70
		}

	} // L: 71

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lbq;",
		garbageValue = "109"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 35
		return var2.getMessage(var1); // L: 36
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-163362829"
	)
	static final int method1192(int var0, int var1) {
		int var2 = method1157(var0 - 1, var1 - 1) + method1157(1 + var0, var1 - 1) + method1157(var0 - 1, var1 + 1) + method1157(var0 + 1, var1 + 1); // L: 987
		int var3 = method1157(var0 - 1, var1) + method1157(1 + var0, var1) + method1157(var0, var1 - 1) + method1157(var0, var1 + 1); // L: 988
		int var4 = method1157(var0, var1); // L: 989
		return var2 / 16 + var3 / 8 + var4 / 4; // L: 990
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-118"
	)
	static final int method1157(int var0, int var1) {
		int var2 = var1 * 57 + var0; // L: 994
		var2 ^= var2 << 13; // L: 995
		int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE; // L: 996
		return var3 >> 19 & 255; // L: 997
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1433470376"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1; // L: 4631
	}
}
