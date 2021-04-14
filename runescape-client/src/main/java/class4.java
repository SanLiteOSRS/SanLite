import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("b")
public class class4 extends class14 {
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "Lhu;"
	)
	static Widget field35;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -464721427
	)
	int field33;
	@ObfuscatedName("o")
	String field34;
	// $FF: synthetic field
	@ObfuscatedSignature(
		signature = "Lu;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		signature = "(Lu;)V"
	)
	class4(class2 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "-1383981708"
	)
	void vmethod371(Buffer var1) {
		this.field33 = var1.readInt();
		this.field34 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lm;I)V",
		garbageValue = "-1475503816"
	)
	void vmethod376(class11 var1) {
		var1.method158(this.field33, this.field34);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(CI)Z",
		garbageValue = "-2084142050"
	)
	static boolean method76(char var0) {
		return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var0) != -1;
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "1882988132"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.field842) {
			class232.method4360();
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && Login.clientPreferences.musicVolume != 0 && !Client.field842) {
			WorldMapSection0.playMusicTrack(2, class8.archive6, var0, 0, Login.clientPreferences.musicVolume, false);
		}

		Client.currentTrackGroupId = var0;
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		signature = "(IIZB)V",
		garbageValue = "1"
	)
	static final void method75(int var0, int var1, boolean var2) {
		if (Client.field820[var0] != null) {
			if (var1 >= 0 && var1 < Client.field820[var0].method46()) {
				class9 var3 = (class9)Client.field820[var0].field27.get(var1);
				PacketWriter var4 = Client.packetWriter;
				PacketBufferNode var5 = ObjectComposition.getPacketBufferNode(ClientPacket.field2298, var4.isaacCipher);
				var5.packetBuffer.writeByte(4 + Friend.stringCp1252NullTerminatedByteSize(var3.field65));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeBoolean(var2);
				var5.packetBuffer.writeStringCp1252NullTerminated(var3.field65);
				var4.addNode(var5);
			}
		}
	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "-1616057238"
	)
	static void method77(String var0) {
		class0.field4 = var0;

		try {
			String var1 = class10.client.getParameter(Integer.toString(18));
			String var2 = class10.client.getParameter(Integer.toString(13));
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
			if (var0.length() == 0) {
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + MouseHandler.method724(ObjectSound.currentTimeMillis() + 94608000000L) + "; Max-Age=" + 94608000L;
			}

			class42.method505(class10.client, "document.cookie=\"" + var3 + "\"");
		} catch (Throwable var4) {
		}

	}
}
