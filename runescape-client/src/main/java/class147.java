import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
public class class147 extends class128 {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -326277189
	)
	int field1659;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lei;)V"
	)
	class147(class131 var1) {
		this.this$0 = var1;
		this.field1659 = -1; // L: 144
	} // L: 146

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-885940784"
	)
	void vmethod3087(Buffer var1) {
		this.field1659 = var1.readUnsignedShort(); // L: 149
	} // L: 150

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Leh;B)V",
		garbageValue = "0"
	)
	void vmethod3084(ClanSettings var1) {
		var1.method2935(this.field1659); // L: 153
	} // L: 154

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-2091691243"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (FriendsChatMember.clientPreferences.method2204() != 0 && var1 != 0 && Client.soundEffectCount < 50) { // L: 3599
			Client.soundEffectIds[Client.soundEffectCount] = var0; // L: 3600
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1; // L: 3601
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 3602
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3603
			Client.soundLocations[Client.soundEffectCount] = 0; // L: 3604
			++Client.soundEffectCount; // L: 3605
		}

	} // L: 3607
}
