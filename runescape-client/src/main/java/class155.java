import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
public class class155 extends class159 {
	@ObfuscatedName("ay")
	String field1720;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -582162033
	)
	int field1716;
	@ObfuscatedName("ar")
	byte field1718;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	final class160 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgb;)V"
	)
	class155(class160 var1) {
		this.this$0 = var1;
		this.field1720 = null; // L: 55
	} // L: 59

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "-105"
	)
	void vmethod3335(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 62
			--var1.offset; // L: 63
			var1.readLong(); // L: 64
		}

		this.field1720 = var1.readStringCp1252NullTerminatedOrNull(); // L: 66
		this.field1716 = var1.readUnsignedShort(); // L: 67
		this.field1718 = var1.readByte(); // L: 68
		var1.readLong(); // L: 69
	} // L: 70

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgk;B)V",
		garbageValue = "84"
	)
	void vmethod3337(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember(); // L: 73
		var2.username = new Username(this.field1720); // L: 74
		var2.world = this.field1716; // L: 75
		var2.rank = this.field1718; // L: 76
		var1.addMember(var2); // L: 77
	} // L: 78

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)[Lld;",
		garbageValue = "0"
	)
	static LoginPacket[] method3261() {
		return new LoginPacket[]{LoginPacket.field3347, LoginPacket.field3348, LoginPacket.field3345, LoginPacket.field3343, LoginPacket.field3346, LoginPacket.field3352}; // L: 22
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lhr;",
		garbageValue = "-1949863580"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0); // L: 37
		if (var1 != null) { // L: 38
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0); // L: 39
			var1 = new SpotAnimationDefinition(); // L: 40
			var1.id = var0; // L: 41
			if (var2 != null) { // L: 42
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0); // L: 43
			return var1; // L: 44
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1968643167"
	)
	public static void method3258() {
		HitSplatDefinition.HitSplatDefinition_cached.clear(); // L: 202
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 203
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear(); // L: 204
	} // L: 205

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-75"
	)
	static final void method3259() {
		int var0 = Players.Players_count; // L: 4065
		int[] var1 = Players.Players_indices; // L: 4066

		for (int var2 = 0; var2 < var0; ++var2) { // L: 4067
			Player var3 = Client.players[var1[var2]]; // L: 4068
			if (var3 != null) { // L: 4069
				ServerPacket.updateActorSequence(var3, 1); // L: 4070
			}
		}

	} // L: 4073
}
