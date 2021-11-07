import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mm")
@Implements("Ignored")
public class Ignored extends Nameable {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -781927569
	)
	@Export("id")
	int id;

	Ignored() {
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lmm;I)I",
		garbageValue = "867220542"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lla;I)I",
		garbageValue = "-1073614160"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)[Lom;",
		garbageValue = "1673389223"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.field4378, FillMode.field4377, FillMode.SOLID};
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1749194740"
	)
	static final boolean method6212(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
	}
}
