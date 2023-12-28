import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
public class class191 extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	public static EvictingDualNodeHashTable field1979;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	static AbstractArchive field1977;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	static GameBuild field1978;

	static {
		field1979 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-993585503"
	)
	public static void method3758(int var0, int var1, int var2, int var3) {
		if (class316.field3422.size() > 1 && class316.field3422.get(0) != null && ((class328)class316.field3422.get(0)).field3522.isReady() && class316.field3422.get(1) != null && ((class328)class316.field3422.get(1)).field3522.isReady()) { // L: 128
			EnumComposition.method3678(var0, var1, var2, var3); // L: 129
			class316.field3413.add(new class412((class418)null)); // L: 130
			ArrayList var4 = new ArrayList(); // L: 131
			var4.add(new class414(new class417((class418)null, 1, false, class316.field3417), class316.field3419)); // L: 132
			var4.add(new class414(new class416((class418)null, 0, false, class316.field3418), class316.field3421)); // L: 133
			class316.field3413.add(new class419((class418)null, var4)); // L: 134
			if (class316.field3424.get(0) != null && class316.field3424.get(1) != null) { // L: 135
				class328 var5 = (class328)class316.field3424.get(0); // L: 136
				class316.field3424.set(0, class316.field3422.get(1)); // L: 137
				class316.field3424.set(1, var5); // L: 138
			}
		}

	} // L: 141
}
