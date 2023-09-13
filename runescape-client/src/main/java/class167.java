import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
public class class167 extends class143 {
	@ObfuscatedName("ai")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;
	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -739944557
	)
	int field1829;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = -609205745967376381L
	)
	long field1826;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class167(class146 var1) {
		this.this$0 = var1; // L: 307
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "209179459"
	)
	void vmethod3337(Buffer var1) {
		this.field1829 = var1.readInt(); // L: 310
		this.field1826 = var1.readLong(); // L: 311
	} // L: 312

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfi;B)V",
		garbageValue = "73"
	)
	void vmethod3339(ClanSettings var1) {
		var1.method3195(this.field1829, this.field1826); // L: 315
	} // L: 316

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "769198964"
	)
	static final void method3342() {
		for (GraphicsObject var0 = (GraphicsObject)Client.graphicsObjects.last(); var0 != null; var0 = (GraphicsObject)Client.graphicsObjects.previous()) { // L: 5118 5119 5126
			if (var0.plane == HealthBar.Client_plane && !var0.isFinished) { // L: 5120
				if (Client.cycle >= var0.cycleStart) { // L: 5121
					var0.advance(Client.field605); // L: 5122
					if (var0.isFinished) {
						var0.remove(); // L: 5123
					} else {
						class130.scene.drawEntity(var0.plane, var0.x, var0.y, var0.z, 60, var0, 0, -1L, false); // L: 5124
					}
				}
			} else {
				var0.remove();
			}
		}

	} // L: 5128
}
