import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
public class class160 extends class145 {
	@ObfuscatedName("ao")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 401504703
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = 5609490768388996985L
	)
	long field1751;
	@ObfuscatedName("al")
	String field1748;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -475909911
	)
	int field1749;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lff;)V"
	)
	class160(class148 var1) {
		this.this$0 = var1;
		this.field1751 = -1L;
		this.field1748 = null; // L: 94
		this.field1749 = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-11659242"
	)
	void vmethod3414(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1751 = var1.readLong(); // L: 102
		}

		this.field1748 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1749 = var1.readUnsignedShort();
	} // L: 106

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgi;I)V",
		garbageValue = "21847466"
	)
	void vmethod3415(ClanSettings var1) {
		var1.method3242(this.field1751, this.field1748, this.field1749);
	}

	@ObfuscatedName("ac")
	public static String method3339(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 16
			if (var0 % 37L == 0L) { // L: 17
				return null;
			} else {
				int var2 = 0; // L: 18

				for (long var3 = var0; 0L != var3; var3 /= 37L) { // L: 19 20 22
					++var2; // L: 21
				}

				StringBuilder var5 = new StringBuilder(var2);

				while (var0 != 0L) {
					long var6 = var0;
					var0 /= 37L;
					var5.append(class403.base37Table[(int)(var6 - var0 * 37L)]);
				}

				return var5.reverse().toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Loa;II)Llx;",
		garbageValue = "1083227717"
	)
	public static PacketBufferNode method3340(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3224, Client.packetWriter.isaacCipher); // L: 23
		var4.packetBuffer.writeByte(0); // L: 24
		int var5 = var4.packetBuffer.offset; // L: 25
		var4.packetBuffer.writeByte(var0); // L: 26
		String var6 = var1.toLowerCase(); // L: 27
		int var7 = 0; // L: 28
		byte[] var8 = null; // L: 29
		if (var6.startsWith("yellow:")) { // L: 30
			var7 = 0; // L: 31
			var1 = var1.substring("yellow:".length()); // L: 32
		} else if (var6.startsWith("red:")) { // L: 34
			var7 = 1; // L: 35
			var1 = var1.substring("red:".length()); // L: 36
		} else if (var6.startsWith("green:")) { // L: 38
			var7 = 2; // L: 39
			var1 = var1.substring("green:".length()); // L: 40
		} else if (var6.startsWith("cyan:")) { // L: 42
			var7 = 3; // L: 43
			var1 = var1.substring("cyan:".length()); // L: 44
		} else if (var6.startsWith("purple:")) { // L: 46
			var7 = 4; // L: 47
			var1 = var1.substring("purple:".length()); // L: 48
		} else if (var6.startsWith("white:")) { // L: 50
			var7 = 5; // L: 51
			var1 = var1.substring("white:".length()); // L: 52
		} else if (var6.startsWith("flash1:")) { // L: 54
			var7 = 6; // L: 55
			var1 = var1.substring("flash1:".length()); // L: 56
		} else if (var6.startsWith("flash2:")) { // L: 58
			var7 = 7; // L: 59
			var1 = var1.substring("flash2:".length()); // L: 60
		} else if (var6.startsWith("flash3:")) { // L: 62
			var7 = 8; // L: 63
			var1 = var1.substring("flash3:".length()); // L: 64
		} else if (var6.startsWith("glow1:")) { // L: 66
			var7 = 9; // L: 67
			var1 = var1.substring("glow1:".length()); // L: 68
		} else if (var6.startsWith("glow2:")) { // L: 70
			var7 = 10; // L: 71
			var1 = var1.substring("glow2:".length()); // L: 72
		} else if (var6.startsWith("glow3:")) { // L: 74
			var7 = 11; // L: 75
			var1 = var1.substring("glow3:".length()); // L: 76
		} else if (var6.startsWith("rainbow:")) { // L: 78
			var7 = 12; // L: 79
			var1 = var1.substring("rainbow:".length()); // L: 80
		} else if (var6.startsWith("pattern")) { // L: 82
			var8 = class161.method3347(var6); // L: 83
			if (var8 != null) { // L: 84
				var7 = var8.length + 12; // L: 85
				var1 = var1.substring("pattern".length() + var8.length + 1); // L: 86
			}
		}

		var6 = var1.toLowerCase(); // L: 89
		byte var9 = 0; // L: 90
		if (var6.startsWith("wave:")) { // L: 91
			var9 = 1; // L: 92
			var1 = var1.substring("wave:".length()); // L: 93
		} else if (var6.startsWith("wave2:")) { // L: 95
			var9 = 2; // L: 96
			var1 = var1.substring("wave2:".length()); // L: 97
		} else if (var6.startsWith("shake:")) { // L: 99
			var9 = 3; // L: 100
			var1 = var1.substring("shake:".length()); // L: 101
		} else if (var6.startsWith("scroll:")) { // L: 103
			var9 = 4; // L: 104
			var1 = var1.substring("scroll:".length()); // L: 105
		} else if (var6.startsWith("slide:")) { // L: 107
			var9 = 5; // L: 108
			var1 = var1.substring("slide:".length());
		}

		var4.packetBuffer.writeByte(var7); // L: 111
		var4.packetBuffer.writeByte(var9); // L: 112
		if (var8 != null && Client.field527 >= 214) { // L: 113
			for (int var10 = 0; var10 < var8.length; ++var10) { // L: 114
				var4.packetBuffer.writeByte(var8[var10]); // L: 115
			}
		}

		class150.method3192(var4.packetBuffer, var1); // L: 118
		if (var0 == class354.field3851.rsOrdinal()) { // L: 119
			var4.packetBuffer.writeByte(var3); // L: 120
		}

		var4.packetBuffer.method9200(var4.packetBuffer.offset - var5); // L: 122
		return var4; // L: 123
	}

	@ObfuscatedName("av")
	static final void method3338(long var0) {
		ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0; // L: 109
	} // L: 110
}
