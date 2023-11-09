import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
public final class class387 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[Lno;"
	)
	static class387[] field4403;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1215158199
	)
	static int field4402;
	@ObfuscatedName("u")
	float field4405;
	@ObfuscatedName("c")
	float field4404;
	@ObfuscatedName("z")
	float field4406;
	@ObfuscatedName("j")
	float field4401;

	static {
		field4403 = new class387[0]; // L: 4
		class362.method6603(100); // L: 9
		new class387();
	} // L: 14

	class387() {
		this.method6974(); // L: 44
	} // L: 45

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-4"
	)
	public void method6987() {
		synchronized(field4403) { // L: 38
			if (class126.field1537 < field4402 - 1) { // L: 39
				field4403[++class126.field1537 - 1] = this;
			}

		}
	} // L: 41

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "1337450325"
	)
	void method6978(float var1, float var2, float var3, float var4) {
		this.field4405 = var1; // L: 48
		this.field4404 = var2; // L: 49
		this.field4401 = var3; // L: 50
		this.field4406 = var4; // L: 51
	} // L: 52

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(FFFFB)V",
		garbageValue = "-88"
	)
	public void method6973(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(var4 * 0.5F)); // L: 55
		float var6 = (float)Math.cos((double)(var4 * 0.5F)); // L: 56
		this.field4405 = var5 * var1; // L: 57
		this.field4404 = var2 * var5; // L: 58
		this.field4401 = var5 * var3; // L: 59
		this.field4406 = var6; // L: 60
	} // L: 61

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-23299"
	)
	final void method6974() {
		this.field4401 = 0.0F; // L: 64
		this.field4404 = 0.0F; // L: 65
		this.field4405 = 0.0F; // L: 66
		this.field4406 = 1.0F; // L: 67
	} // L: 68

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lno;S)V",
		garbageValue = "10588"
	)
	public final void method6970(class387 var1) {
		this.method6978(var1.field4405 * this.field4406 + var1.field4406 * this.field4405 + var1.field4404 * this.field4401 - var1.field4401 * this.field4404, var1.field4401 * this.field4405 + this.field4406 * var1.field4404 + (this.field4404 * var1.field4406 - this.field4401 * var1.field4405), var1.field4405 * this.field4404 + var1.field4406 * this.field4401 - this.field4405 * var1.field4404 + var1.field4401 * this.field4406, var1.field4406 * this.field4406 - var1.field4405 * this.field4405 - this.field4404 * var1.field4404 - var1.field4401 * this.field4401); // L: 71
	} // L: 72

	public boolean equals(Object var1) {
		if (!(var1 instanceof class387)) { // L: 76
			return false; // L: 80
		} else {
			class387 var2 = (class387)var1; // L: 77
			return this.field4405 == var2.field4405 && this.field4404 == var2.field4404 && var2.field4401 == this.field4401 && var2.field4406 == this.field4406; // L: 78
		}
	}

	public String toString() {
		return this.field4405 + "," + this.field4404 + "," + this.field4401 + "," + this.field4406; // L: 96
	}

	public int hashCode() {
		boolean var1 = true; // L: 85
		float var2 = 1.0F; // L: 86
		var2 = var2 * 31.0F + this.field4405; // L: 87
		var2 = this.field4404 + var2 * 31.0F; // L: 88
		var2 = 31.0F * var2 + this.field4401; // L: 89
		var2 = 31.0F * var2 + this.field4406; // L: 90
		return (int)var2; // L: 91
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lpy;B)Ljava/lang/Object;",
		garbageValue = "79"
	)
	static Object method6998(class433 var0) {
		if (var0 == null) { // L: 5006
			throw new IllegalStateException("popValueOfType() failure - null baseVarType"); // L: 5007
		} else {
			switch(var0.field4670) { // L: 5009
			case 1:
				return Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 5011
			case 2:
				return Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 5015
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type"); // L: 5013
			}
		}
	}
}
