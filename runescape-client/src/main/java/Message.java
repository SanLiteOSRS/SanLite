import java.util.LinkedHashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("st")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 655345323
	)
	@Export("count")
	int count;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -570932661
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -186645555
	)
	@Export("type")
	int type;
	@ObfuscatedName("m")
	@Export("sender")
	String sender;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lkm;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lkz;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lkz;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("c")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("u")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown;
		this.isFromIgnored0 = TriBool.TriBool_unknown;
		this.set(var1, var2, var3, var4);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-136019615"
	)
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		this.count = Buddy.method5322();
		this.cycle = Client.cycle;
		this.type = var1;
		this.sender = var2;
		this.fillSenderUsername();
		this.prefix = var3;
		this.text = var4;
		this.clearIsFromFriend();
		this.clearIsFromIgnored();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "406070188"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "722132951"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) {
			this.fillIsFromFriend();
		}

		return this.isFromFriend0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1917257545"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = WorldMapLabelSize.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "341204953"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "-53"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
			this.fillIsFromIgnored();
		}

		return this.isFromIgnored0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-73"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = WorldMapLabelSize.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-799394234"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) {
			this.senderUsername = new Username(GrandExchangeOfferUnitPriceComparator.method218(this.sender), UserComparator4.loginType);
		} else {
			this.senderUsername = null;
		}

	}

	@ObfuscatedName("t")
	static final void method1315(long var0) {
		ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0;
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		signature = "(ZB)V",
		garbageValue = "91"
	)
	static final void method1314(boolean var0) {
		if (var0) {
			Client.field717 = Login.field1227 ? class169.field2029 : class169.field2034;
		} else {
			LinkedHashMap var1 = GrandExchangeOfferAgeComparator.clientPreferences.parameters;
			String var3 = Login.Login_username;
			int var4 = var3.length();
			int var5 = 0;

			for (int var6 = 0; var6 < var4; ++var6) {
				var5 = (var5 << 5) - var5 + var3.charAt(var6);
			}

			Client.field717 = var1.containsKey(var5) ? class169.field2033 : class169.field2028;
		}

	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "1336792033"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = class4.getPacketBufferNode(ClientPacket.field2329, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(SpriteMask.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
