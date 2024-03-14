import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
public class class47 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lco;"
	)
	VorbisSample field328;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lbr;"
	)
	RawSound field329;
	@ObfuscatedName("al")
	ReentrantLock field330;

	@ObfuscatedSignature(
		descriptor = "(Lco;Lbr;)V"
	)
	class47(VorbisSample var1, RawSound var2) {
		this.field328 = var1; // L: 11
		this.field329 = var2; // L: 12
		this.field330 = new ReentrantLock(); // L: 13
	} // L: 14

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(Ldz;I)V",
		garbageValue = "-1988199799"
	)
	static final void method841(Actor var0) {
		int var1 = Math.max(1, var0.spotAnimation - Client.cycle); // L: 4332
		int var2 = var0.field1257 * 128 + var0.field1212 * 64; // L: 4333
		int var3 = var0.field1259 * 128 + var0.field1212 * 64; // L: 4334
		var0.x += (var2 - var0.x) / var1; // L: 4335
		var0.y += (var3 - var0.y) / var1; // L: 4336
		var0.field1279 = 0; // L: 4337
		var0.orientation = var0.field1223; // L: 4338
	} // L: 4339

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldm;",
		garbageValue = "473319212"
	)
	static final InterfaceParent method840(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 12510
		var3.group = var1; // L: 12511
		var3.type = var2; // L: 12512
		Client.interfaceParents.put(var3, (long)var0); // L: 12513
		TaskHandler.method4199(var1); // L: 12514
		Widget var4 = ArchiveLoader.field1070.method6431(var0); // L: 12515
		UserComparator5.invalidateWidget(var4); // L: 12516
		if (Client.meslayerContinueWidget != null) { // L: 12517
			UserComparator5.invalidateWidget(Client.meslayerContinueWidget); // L: 12518
			Client.meslayerContinueWidget = null; // L: 12519
		}

		class167.revalidateWidgetScroll(ArchiveLoader.field1070.field3633[var0 >> 16], var4, false); // L: 12521
		Nameable.method8331(var1); // L: 12522
		if (Client.rootInterface != -1) { // L: 12523
			Canvas.method292(Client.rootInterface, 1);
		}

		return var3; // L: 12524
	}
}
