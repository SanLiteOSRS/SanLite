import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("l")
public class class8 implements Callable {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1988326555
	)
	@Export("gameCyclesToDo")
	protected static int gameCyclesToDo;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		signature = "Llo;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lkj;"
	)
	final Buffer field35;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lm;"
	)
	final class12 field32;
	// $FF: synthetic field
	@ObfuscatedSignature(
		signature = "Lz;"
	)
	final class9 this$0;

	@ObfuscatedSignature(
		signature = "(Lz;Lkj;Lm;)V"
	)
	class8(class9 var1, Buffer var2, class12 var3) {
		this.this$0 = var1;
		this.field35 = var2;
		this.field32 = var3;
	}

	public Object call() {
		return this.field32.vmethod123(this.field35);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "-497960753"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
		}
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		signature = "(Lhe;I)Z",
		garbageValue = "-2010469963"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) {
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) {
				int var2 = HealthBarDefinition.method4512(var0, var1);
				int var3 = var0.cs1ComparisonValues[var1];
				if (var0.cs1Comparisons[var1] == 2) {
					if (var2 >= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) {
					if (var2 <= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) {
					if (var2 == var3) {
						return false;
					}
				} else if (var3 != var2) {
					return false;
				}
			}

			return true;
		}
	}
}
