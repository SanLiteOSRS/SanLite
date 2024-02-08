import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class151 extends class159 {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 405054527
	)
	static int field1681;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -950851675
	)
	int field1679;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	final class160 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgr;)V"
	)
	class151(class160 var1) {
		this.this$0 = var1;
		this.field1679 = -1; // L: 84
	} // L: 86

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-1814222712"
	)
	void vmethod3518(Buffer var1) {
		this.field1679 = var1.readUnsignedShort(); // L: 89
		var1.readUnsignedByte(); // L: 90
		if (var1.readUnsignedByte() != 255) { // L: 91
			--var1.offset; // L: 92
			var1.readLong(); // L: 93
		}

	} // L: 95

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "1662663599"
	)
	void vmethod3519(ClanChannel var1) {
		var1.removeMember(this.field1679); // L: 98
	} // L: 99

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Lhq;",
		garbageValue = "1583239714"
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;B)Z",
		garbageValue = "97"
	)
	static boolean method3312(Date var0) {
		java.util.Calendar var2 = java.util.Calendar.getInstance(); // L: 1132
		var2.set(2, 0); // L: 1133
		var2.set(5, 1); // L: 1134
		var2.set(1, 1900); // L: 1135
		Date var1 = var2.getTime(); // L: 1136
		return var0.after(var1); // L: 1139
	}
}
