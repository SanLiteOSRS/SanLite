import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ov")
public class class408 {
	@ObfuscatedName("tb")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("soundEffectsArchive")
	public static AbstractArchive soundEffectsArchive;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -196401313
	)
	public final int field4363;
	@ObfuscatedName("w")
	public Object field4361;

	public class408(int var1) {
		this.field4363 = var1;
	}

	public class408(int var1, Object var2) {
		this.field4363 = var1;
		this.field4361 = var2;
	}

	public int hashCode() {
		return super.hashCode();
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class408)) {
			return false;
		} else {
			class408 var2 = (class408)var1;
			if (var2.field4361 == null && this.field4361 != null) {
				return false;
			} else if (this.field4361 == null && var2.field4361 != null) {
				return false;
			} else {
				return var2.field4363 == this.field4363 && var2.field4361.equals(this.field4361);
			}
		}
	}
}
