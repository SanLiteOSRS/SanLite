import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
public class class317 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	public AbstractArchive field3519;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -71154561
	)
	public int field3509;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -899924601
	)
	public int field3508;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 80790811
	)
	public int field3517;
	@ObfuscatedName("ay")
	public float field3512;
	@ObfuscatedName("ap")
	public boolean field3510;
	@ObfuscatedName("av")
	public boolean field3514;
	@ObfuscatedName("an")
	public boolean field3515;
	@ObfuscatedName("au")
	public boolean field3516;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	public MidiPcmStream field3511;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lbx;"
	)
	public SoundCache field3518;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	public MusicTrack field3513;

	@ObfuscatedSignature(
		descriptor = "(Lnr;Ljava/lang/String;Ljava/lang/String;IZ)V"
	)
	public class317(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		this.field3509 = -1;
		this.field3508 = -1;
		this.field3517 = 0;
		this.field3512 = 0.0F;
		this.field3510 = false;
		this.field3516 = false;
		this.field3509 = var1.getGroupId(var2); // L: 21
		this.field3508 = var1.getFileId(this.field3509, var3); // L: 22
		this.method6076(var1, this.field3509, this.field3508, var4, var5);
	}

	@ObfuscatedSignature(
		descriptor = "(Lnr;IIIZ)V"
	)
	public class317(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.field3509 = -1; // L: 8
		this.field3508 = -1; // L: 9
		this.field3517 = 0; // L: 10
		this.field3512 = 0.0F; // L: 11
		this.field3510 = false; // L: 12
		this.field3516 = false; // L: 15
		this.method6076(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lnr;IIIZI)V",
		garbageValue = "-193407546"
	)
	void method6076(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.field3519 = var1;
		this.field3509 = var2;
		this.field3508 = var3; // L: 33
		this.field3517 = var4;
		this.field3510 = var5;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Lol;IB)Llc;",
		garbageValue = "-55"
	)
	public static PacketBufferNode method6082(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = class217.getPacketBufferNode(ClientPacket.field3157, Client.packetWriter.isaacCipher); // L: 23
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
			var8 = class6.method41(var6); // L: 83
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
			var1 = var1.substring("slide:".length()); // L: 109
		}

		var4.packetBuffer.writeByte(var7); // L: 111
		var4.packetBuffer.writeByte(var9); // L: 112
		if (var8 != null && Client.field507 >= 214) { // L: 113
			for (int var10 = 0; var10 < var8.length; ++var10) { // L: 114
				var4.packetBuffer.writeByte(var8[var10]); // L: 115
			}
		}

		MusicPatch.method6021(var4.packetBuffer, var1); // L: 118
		if (var0 == class339.field3799.rsOrdinal()) { // L: 119
			var4.packetBuffer.writeByte(var3); // L: 120
		}

		var4.packetBuffer.method9054(var4.packetBuffer.offset - var5); // L: 122
		return var4; // L: 123
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "-35"
	)
	public static int method6078(CharSequence var0) {
		return GrandExchangeOffer.method6969(var0, 10, true); // L: 77
	}
}
