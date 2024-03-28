import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
public class class151 extends class144 {
	@ObfuscatedName("az")
	boolean field1720;
	@ObfuscatedName("ah")
	byte field1716;
	@ObfuscatedName("af")
	byte field1717;
	@ObfuscatedName("at")
	byte field1715;
	@ObfuscatedName("an")
	byte field1718;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class151(class147 var1) {
		this.this$0 = var1; // L: 248
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "1253598633"
	)
	void vmethod3420(Buffer var1) {
		this.field1720 = var1.readUnsignedByte() == 1; // L: 251
		this.field1716 = var1.readByte(); // L: 252
		this.field1717 = var1.readByte(); // L: 253
		this.field1715 = var1.readByte(); // L: 254
		this.field1718 = var1.readByte(); // L: 255
	} // L: 256

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfp;B)V",
		garbageValue = "-123"
	)
	void vmethod3419(ClanSettings var1) {
		var1.allowGuests = this.field1720; // L: 259
		var1.field1752 = this.field1716; // L: 260
		var1.field1740 = this.field1717; // L: 261
		var1.field1749 = this.field1715; // L: 262
		var1.field1741 = this.field1718; // L: 263
	} // L: 264

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "915265909"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (NPC.clientPreferences.method2473() != 0 && var1 != 0 && Client.soundEffectCount < 50) { // L: 3855
			Client.soundEffectIds[Client.soundEffectCount] = var0; // L: 3856
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1; // L: 3857
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 3858
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3859
			Client.soundLocations[Client.soundEffectCount] = 0; // L: 3860
			Client.field770[Client.soundEffectCount] = 0; // L: 3861
			++Client.soundEffectCount; // L: 3862
		}

	} // L: 3864
}
