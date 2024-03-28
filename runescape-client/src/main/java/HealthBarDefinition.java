import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	public static AbstractArchive field2055;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("NpcDefinition_cachedModels")
	public static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	static EvictingDualNodeHashTable field2046;
	@ObfuscatedName("nz")
	@ObfuscatedGetter(
		intValue = 1264795921
	)
	@Export("menuWidth")
	static int menuWidth;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = -2037038519
	)
	static int field2044;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1269060333
	)
	public int field2061;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1585735123
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -212201907
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 456686747
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 615110845
	)
	public int field2049;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1265171965
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -608838045
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 567547233
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -231788403
	)
	@Export("width")
	public int width;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1001058743
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		NpcDefinition_cachedModels = new EvictingDualNodeHashTable(64); // L: 14
		field2046 = new EvictingDualNodeHashTable(64); // L: 15
	}

	public HealthBarDefinition() {
		this.int1 = 255; // L: 19
		this.int2 = 255; // L: 20
		this.int3 = -1; // L: 21
		this.field2049 = 1; // L: 22
		this.int5 = 70; // L: 23
		this.frontSpriteID = -1; // L: 24
		this.backSpriteID = -1;
		this.width = 30;
		this.widthPadding = 0; // L: 27
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)V",
		garbageValue = "-67"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 31
			if (var2 == 0) { // L: 32
				return; // L: 35
			}

			this.decodeNext(var1, var2); // L: 33
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lur;IB)V",
		garbageValue = "115"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 38
			var1.readUnsignedShort(); // L: 39
		} else if (var2 == 2) { // L: 41
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 42
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) { // L: 43
			this.int3 = 0;
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort(); // L: 44
		} else if (var2 == 6) { // L: 45
			var1.readUnsignedByte(); // L: 46
		} else if (var2 == 7) { // L: 48
			this.frontSpriteID = var1.method9436();
		} else if (var2 == 8) { // L: 49
			this.backSpriteID = var1.method9436();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort(); // L: 50
		} else if (var2 == 14) { // L: 51
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 52
			this.widthPadding = var1.readUnsignedByte();
		}

	} // L: 54

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lvg;",
		garbageValue = "413841288"
	)
	public SpritePixels method3811() {
		if (this.frontSpriteID < 0) { // L: 57
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2046.get((long)this.frontSpriteID); // L: 58
			if (var1 != null) {
				return var1; // L: 59
			} else {
				var1 = GraphicsObject.SpriteBuffer_getSprite(field2055, this.frontSpriteID, 0); // L: 60
				if (var1 != null) {
					field2046.put(var1, (long)this.frontSpriteID); // L: 61
				}

				return var1; // L: 63
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Lvg;",
		garbageValue = "0"
	)
	public SpritePixels method3814() {
		if (this.backSpriteID < 0) { // L: 67
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2046.get((long)this.backSpriteID); // L: 68
			if (var1 != null) {
				return var1; // L: 69
			} else {
				var1 = GraphicsObject.SpriteBuffer_getSprite(field2055, this.backSpriteID, 0); // L: 70
				if (var1 != null) {
					field2046.put(var1, (long)this.backSpriteID); // L: 71
				}

				return var1; // L: 73
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;II)Lmn;",
		garbageValue = "1692915056"
	)
	static MusicPatch method3813(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1); // L: 25
		return var2 == null ? null : new MusicPatch(var2); // L: 26
	}

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-2102652554"
	)
	public static void method3818(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = class425.getPacketBufferNode(ClientPacket.field3263, Client.packetWriter.isaacCipher); // L: 12903
		var4.packetBuffer.method9407(var3 ? Client.field608 : 0); // L: 12904
		var4.packetBuffer.method9398(var0); // L: 12905
		var4.packetBuffer.method9295(var2); // L: 12906
		var4.packetBuffer.method9398(var1); // L: 12907
		Client.packetWriter.addNode(var4); // L: 12908
	} // L: 12909
}
