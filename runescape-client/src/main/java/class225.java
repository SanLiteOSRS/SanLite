import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
public class class225 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	public static final class225 field2686;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	public static final class225 field2680;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	public static final class225 field2682;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	public static final class225 field2683;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	public static final class225 field2681;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	public static final class225 field2685;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	public static final class225 field2687;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	public static final class225 field2684;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	public static final class225 field2688;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	public static final class225 field2689;

	static {
		field2686 = new class225(15);
		field2680 = new class225(7);
		field2682 = new class225(2);
		field2683 = new class225(5);
		field2681 = new class225(14);
		field2685 = new class225(3);
		field2687 = new class225(5);
		field2684 = new class225(4);
		field2688 = new class225(4);
		field2689 = new class225(6);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "15"
	)
	class225(int var1) {
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V",
		garbageValue = "-40"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (Clock.loadInterface(var0)) {
			class4.field49 = null;
			class303.drawInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (class4.field49 != null) {
				class303.drawInterface(class4.field49, -1412584499, var1, var2, var3, var4, class3.field38, class82.field1020, var7);
				class4.field49 = null;
			}

		} else {
			if (var7 != -1) {
				Client.field719[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) {
					Client.field719[var8] = true;
				}
			}

		}
	}
}
