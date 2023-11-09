import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "[Lui;"
	)
	static SpritePixels[] field508;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 892213157
	)
	@Export("count")
	int count;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1312110651
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1417053891
	)
	@Export("type")
	int type;
	@ObfuscatedName("at")
	@Export("sender")
	String sender;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("ap")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("aa")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 13
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 14
		this.set(var1, var2, var3, var4); // L: 19
	} // L: 20

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "80"
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
		this.clearIsFromIgnored(); // L: 35
	} // L: 36

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "963763449"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 39
	} // L: 40

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "10"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) { // L: 43
			this.fillIsFromFriend(); // L: 44
		}

		return this.isFromFriend0 == TriBool.TriBool_true; // L: 46
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-35"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = class299.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 50
	} // L: 51

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 54
	} // L: 55

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1755097600"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) { // L: 58
			this.fillIsFromIgnored(); // L: 59
		}

		return this.isFromIgnored0 == TriBool.TriBool_true; // L: 61
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1656305683"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = class299.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 65
	} // L: 66

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "70"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) {
			this.senderUsername = new Username(class183.method3545(this.sender), Language.loginType); // L: 69
		} else {
			this.senderUsername = null; // L: 70
		}

	} // L: 71

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;ZI)Z",
		garbageValue = "1803169793"
	)
	static boolean method1185(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw"); // L: 233
			int var3 = var2.read(); // L: 234
			var2.seek(0L); // L: 235
			var2.write(var3); // L: 236
			var2.seek(0L); // L: 237
			var2.close(); // L: 238
			if (var1) { // L: 239
				var0.delete();
			}

			return true; // L: 240
		} catch (Exception var4) { // L: 242
			return false; // L: 243
		}
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-103"
	)
	static void method1217() {
		PacketBufferNode var0 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3197, Client.packetWriter.isaacCipher); // L: 4465
		var0.packetBuffer.writeByte(class218.getWindowedMode()); // L: 4466
		var0.packetBuffer.writeShort(class113.canvasWidth); // L: 4467
		var0.packetBuffer.writeShort(class177.canvasHeight); // L: 4468
		Client.packetWriter.addNode(var0); // L: 4469
	} // L: 4470
}
