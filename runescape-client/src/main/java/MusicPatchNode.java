import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		signature = "[Lls;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 2053658771
	)
	int field2484;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lhx;"
	)
	@Export("patch")
	MusicPatch patch;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lde;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lgo;"
	)
	MusicPatchNode2 field2472;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 227260251
	)
	int field2473;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -648254967
	)
	int field2474;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 479011763
	)
	int field2475;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 2012218471
	)
	int field2481;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1638523819
	)
	int field2477;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -585277595
	)
	int field2487;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 3127069
	)
	int field2479;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1275412096
	)
	int field2480;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 2137879269
	)
	int field2478;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 620604654
	)
	int field2482;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -308754063
	)
	int field2483;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1275885009
	)
	int field2489;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 586999213
	)
	int field2485;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1374963465
	)
	int field2469;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Ldm;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 993070793
	)
	int field2488;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -178085679
	)
	int field2486;

	MusicPatchNode() {
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(S)V",
		garbageValue = "10823"
	)
	void method3926() {
		this.patch = null;
		this.rawSound = null;
		this.field2472 = null;
		this.stream = null;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(IB)Ljd;",
		garbageValue = "-111"
	)
	public static HitSplatDefinition method3929(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0);
			var1 = new HitSplatDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;B)V",
		garbageValue = "-27"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = Client.getPacketBufferNode(ClientPacket.field2324, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(Decimator.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
