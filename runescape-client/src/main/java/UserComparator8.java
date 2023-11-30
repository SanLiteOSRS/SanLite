import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("at")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lrh;Lrh;B)I",
		garbageValue = "118"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) { // L: 15
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1; // L: 16
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1; // L: 19
		}

		return this.compareUser(var1, var2); // L: 21
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 25
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(S)[Lfw;",
		garbageValue = "226"
	)
	static class140[] method2955() {
		return new class140[]{class140.field1617, class140.field1608, class140.field1618, class140.field1610, class140.field1611, class140.field1613, class140.field1607, class140.field1614, class140.field1615}; // L: 97
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lol;Lol;I)V",
		garbageValue = "-1842959884"
	)
	public static void method2948(AbstractArchive var0, AbstractArchive var1) {
		SpotAnimationDefinition.SpotAnimationDefinition_archive = var0; // L: 32
		SpotAnimationDefinition.field1998 = var1; // L: 33
	} // L: 34

	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldc;",
		garbageValue = "853776255"
	)
	static final InterfaceParent method2954(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 12475
		var3.group = var1; // L: 12476
		var3.type = var2; // L: 12477
		Client.interfaceParents.put(var3, (long)var0); // L: 12478
		class130.method3095(var1); // L: 12479
		Widget var4 = HealthBarDefinition.field1877.method6285(var0); // L: 12480
		class159.invalidateWidget(var4); // L: 12481
		if (Client.meslayerContinueWidget != null) { // L: 12482
			class159.invalidateWidget(Client.meslayerContinueWidget); // L: 12483
			Client.meslayerContinueWidget = null; // L: 12484
		}

		class132.revalidateWidgetScroll(HealthBarDefinition.field1877.field3568[var0 >> 16], var4, false); // L: 12486
		class106.method2778(var1); // L: 12487
		if (Client.rootInterface != -1) { // L: 12488
			class514.method9131(Client.rootInterface, 1);
		}

		return var3; // L: 12489
	}
}
