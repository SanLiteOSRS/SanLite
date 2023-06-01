import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 62828793
	)
	@Export("count")
	int count;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 183101395
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 404807439
	)
	@Export("type")
	int type;
	@ObfuscatedName("ab")
	@Export("sender")
	String sender;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("aj")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("ac")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 13
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 14
		this.set(var1, var2, var3, var4); // L: 19
	} // L: 20

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V",
		garbageValue = "234"
	)
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		this.count = class151.method3171(); // L: 23
		this.cycle = Client.cycle; // L: 24
		this.type = var1; // L: 25
		this.sender = var2; // L: 26
		this.fillSenderUsername(); // L: 27
		this.prefix = var3; // L: 28
		this.text = var4; // L: 29
		this.clearIsFromFriend(); // L: 30
		this.clearIsFromIgnored(); // L: 31
	} // L: 32

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 35
	} // L: 36

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "69"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) { // L: 39
			this.fillIsFromFriend(); // L: 40
		}

		return this.isFromFriend0 == TriBool.TriBool_true; // L: 42
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1111797901"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = ReflectionCheck.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 46
	} // L: 47

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-58260712"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 50
	} // L: 51

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1510091168"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) { // L: 54
			this.fillIsFromIgnored(); // L: 55
		}

		return this.isFromIgnored0 == TriBool.TriBool_true; // L: 57
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = ReflectionCheck.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 61
	} // L: 62

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1056581954"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) { // L: 65
			this.senderUsername = new Username(WorldMapSection0.method5430(this.sender), class31.loginType);
		} else {
			this.senderUsername = null; // L: 66
		}

	} // L: 67

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfe;",
		garbageValue = "-55527792"
	)
	static class138[] method1191() {
		return new class138[]{class138.field1586, class138.field1587, class138.field1588, class138.field1597, class138.field1590, class138.field1591, class138.field1592, class138.field1594, class138.field1595}; // L: 101
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZI)I",
		garbageValue = "315653959"
	)
	static int method1165(int var0, Script var1, boolean var2) {
		return 2; // L: 5057
	}
}
