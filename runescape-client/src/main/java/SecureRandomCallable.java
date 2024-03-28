import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	SecureRandomCallable() {
	} // L: 36

	public Object call() {
		return UserComparator7.method2883();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-581686838"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		class193.addChatMessage(var0, var1, var2, (String)null); // L: 23
	} // L: 24

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "30270971"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 39
		if (var4 == null) { // L: 40
			var4 = new ItemContainer(); // L: 41
			ItemContainer.itemContainers.put(var4, (long)var0); // L: 42
		}

		if (var4.ids.length <= var1) { // L: 44
			int[] var5 = new int[var1 + 1]; // L: 45
			int[] var6 = new int[var1 + 1]; // L: 46

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) { // L: 47
				var5[var7] = var4.ids[var7]; // L: 48
				var6[var7] = var4.quantities[var7]; // L: 49
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) { // L: 51
				var5[var7] = -1; // L: 52
				var6[var7] = 0; // L: 53
			}

			var4.ids = var5; // L: 55
			var4.quantities = var6; // L: 56
		}

		var4.ids[var1] = var2; // L: 58
		var4.quantities[var1] = var3; // L: 59
	} // L: 60

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lis;B)Z",
		garbageValue = "3"
	)
	static boolean method2276(ObjectComposition var0) {
		if (var0.transforms != null) { // L: 712
			int[] var1 = var0.transforms; // L: 714

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 715
				int var3 = var1[var2]; // L: 716
				ObjectComposition var4 = MouseRecorder.getObjectDefinition(var3); // L: 718
				if (var4.mapIconId != -1) { // L: 719
					return true; // L: 720
				}
			}
		} else if (var0.mapIconId != -1) { // L: 726
			return true; // L: 727
		}

		return false; // L: 729
	}
}
