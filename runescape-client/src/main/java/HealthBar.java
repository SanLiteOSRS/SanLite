import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	static Widget field1302;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		descriptor = "(Lgh;)V"
	)
	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque(); // L: 12
		this.definition = var1; // L: 15
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "1"
	)
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null; // L: 19
		int var6 = 0; // L: 20

		for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) { // L: 21
			++var6; // L: 22
			if (var7.cycle == var1) { // L: 23
				var7.set(var1, var2, var3, var4); // L: 24
				return;
			}

			if (var7.cycle <= var1) {
				var5 = var7;
			}
		}

		if (var5 == null) {
			if (var6 < 4) {
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}

		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5); // L: 33
			if (var6 >= 4) {
				this.updates.last().remove();
			}

		}
	} // L: 35

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Ldv;",
		garbageValue = "478923199"
	)
	@Export("getInventorySprite")
	HealthBarUpdate getInventorySprite(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last(); // L: 38
		if (var2 != null && var2.cycle <= var1) {
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) { // L: 40 41
				var2.remove(); // L: 42
				var2 = var3; // L: 43
			}

			if (this.definition.int5 + var2.cycle + var2.cycleOffset > var1) { // L: 47
				return var2;
			} else {
				var2.remove();
				return null; // L: 50
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1159323457"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method7350(); // L: 55
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2038355157"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var1 = ClientPreferences.method2644(var0); // L: 25
		int var2 = var1.baseVar; // L: 26
		int var3 = var1.startBit; // L: 27
		int var4 = var1.endBit;
		int var5 = Varps.Varps_masks[var4 - var3];
		return Varps.Varps_main[var2] >> var3 & var5; // L: 30
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldm;",
		garbageValue = "-789514227"
	)
	static class89[] method2656() {
		return new class89[]{class89.field1075, class89.field1081, class89.field1072, class89.field1071, class89.field1077}; // L: 16
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZI)V",
		garbageValue = "2050033545"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) { // L: 28
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) { // L: 29
				try {
					Desktop.getDesktop().browse(new URI(var0)); // L: 31
					return; // L: 58
				} catch (Exception var4) { // L: 34
				}
			}

			if (class31.field157.startsWith("win")) { // L: 36
				Canvas.method325(var0, 0, "openjs"); // L: 39
			} else if (class31.field157.startsWith("mac")) { // L: 44
				Canvas.method325(var0, 1, "openjs"); // L: 45
			} else {
				Canvas.method325(var0, 2, "openjs"); // L: 49
			}
		} else {
			Canvas.method325(var0, 3, "openjs"); // L: 54
		}

	}
}
