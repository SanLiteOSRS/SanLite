import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = 1008243717
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000; // L: 6
	} // L: 8

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljr;",
		garbageValue = "798227647"
	)
	@Export("getModel")
	protected Model getModel() {
		return null; // L: 19
	}

	@ObfuscatedName("db")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		Model var11 = this.getModel(); // L: 11
		if (var11 != null) { // L: 12
			this.height = var11.height; // L: 13
			var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9); // L: 14
		}

	} // L: 16

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-109873503"
	)
	public static void method4713() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear(); // L: 85
	} // L: 86

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-597035474"
	)
	static final void method4709() {
		if (Client.logoutTimer > 0) { // L: 2995
			ArchiveDisk.logOut(); // L: 2996
		} else {
			Client.timer.method7702(); // L: 2999
			class317.method6014(40); // L: 3000
			AbstractSocket.field4675 = Client.packetWriter.getSocket(); // L: 3001
			Client.packetWriter.removeSocket(); // L: 3002
		}
	} // L: 2997 3003
}
