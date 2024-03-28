import java.awt.Component;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
public class class187 {
	@ObfuscatedName("af")
	public short[] field1959;
	@ObfuscatedName("at")
	public short[] field1961;

	public class187(int var1) {
		ItemComposition var2 = class10.ItemComposition_get(var1); // L: 12
		if (var2.method4200()) { // L: 13
			this.field1959 = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.field1959, 0, this.field1959.length);
		}

		if (var2.method4149()) { // L: 17
			this.field1961 = new short[var2.retextureTo.length]; // L: 18
			System.arraycopy(var2.retextureTo, 0, this.field1961, 0, this.field1961.length); // L: 19
		}

	} // L: 21

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1265086727"
	)
	public static void method3691() {
		class204.field2084.clear(); // L: 14
	} // L: 15

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-1297275108"
	)
	static void method3692(Component var0) {
		var0.removeMouseListener(MouseHandler.MouseHandler_instance); // L: 43
		var0.removeMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 44
		var0.removeFocusListener(MouseHandler.MouseHandler_instance); // L: 45
		MouseHandler.MouseHandler_currentButtonVolatile = 0; // L: 46
	} // L: 47
}
