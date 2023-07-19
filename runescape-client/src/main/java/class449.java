import java.util.Date;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ri")
public final class class449 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lri;"
	)
	static class449[] field4724;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2101611675
	)
	static int field4723;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1079727221
	)
	static int field4725;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -879262843
	)
	static int field4730;
	@ObfuscatedName("aw")
	float field4726;
	@ObfuscatedName("ay")
	float field4727;
	@ObfuscatedName("ap")
	float field4728;
	@ObfuscatedName("av")
	float field4729;

	static {
		field4724 = new class449[0]; // L: 4
		class167.method3457(100); // L: 9
		new class449();
	} // L: 14

	class449() {
		this.method8175(); // L: 44
	} // L: 45

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public void method8198() {
		synchronized(field4724) { // L: 38
			if (field4725 < field4723 - 1) { // L: 39
				field4724[++field4725 - 1] = this;
			}

		}
	} // L: 41

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "913930831"
	)
	void method8174(float var1, float var2, float var3, float var4) {
		this.field4726 = var1; // L: 48
		this.field4727 = var2; // L: 49
		this.field4728 = var3; // L: 50
		this.field4729 = var4; // L: 51
	} // L: 52

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "860808264"
	)
	public void method8197(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(var4 * 0.5F)); // L: 55
		float var6 = (float)Math.cos((double)(0.5F * var4)); // L: 56
		this.field4726 = var5 * var1; // L: 57
		this.field4727 = var2 * var5; // L: 58
		this.field4728 = var5 * var3; // L: 59
		this.field4729 = var6; // L: 60
	} // L: 61

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "95"
	)
	final void method8175() {
		this.field4728 = 0.0F; // L: 64
		this.field4727 = 0.0F; // L: 65
		this.field4726 = 0.0F; // L: 66
		this.field4729 = 1.0F; // L: 67
	} // L: 68

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lri;I)V",
		garbageValue = "1982877150"
	)
	public final void method8176(class449 var1) {
		this.method8174(this.field4728 * var1.field4727 + var1.field4729 * this.field4726 + this.field4729 * var1.field4726 - this.field4727 * var1.field4728, this.field4726 * var1.field4728 + var1.field4727 * this.field4729 + (this.field4727 * var1.field4729 - this.field4728 * var1.field4726), this.field4727 * var1.field4726 + var1.field4729 * this.field4728 - this.field4726 * var1.field4727 + this.field4729 * var1.field4728, this.field4729 * var1.field4729 - var1.field4726 * this.field4726 - this.field4727 * var1.field4727 - var1.field4728 * this.field4728); // L: 71
	} // L: 72

	public boolean equals(Object var1) {
		if (!(var1 instanceof class449)) { // L: 76
			return false; // L: 80
		} else {
			class449 var2 = (class449)var1; // L: 77
			return this.field4726 == var2.field4726 && var2.field4727 == this.field4727 && this.field4728 == var2.field4728 && var2.field4729 == this.field4729; // L: 78
		}
	}

	public int hashCode() {
		boolean var1 = true; // L: 85
		float var2 = 1.0F; // L: 86
		var2 = var2 * 31.0F + this.field4726; // L: 87
		var2 = this.field4727 + 31.0F * var2; // L: 88
		var2 = this.field4728 + var2 * 31.0F; // L: 89
		var2 = this.field4729 + 31.0F * var2; // L: 90
		return (int)var2; // L: 91
	}

	public String toString() {
		return this.field4726 + "," + this.field4727 + "," + this.field4728 + "," + this.field4729; // L: 96
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;I)Z",
		garbageValue = "1531055627"
	)
	static boolean method8201(Date var0) {
		java.util.Calendar var1 = java.util.Calendar.getInstance(); // L: 1095
		var1.set(1, var1.get(1) - 13); // L: 1096
		var1.set(5, var1.get(5) + 1); // L: 1097
		var1.set(11, 0); // L: 1098
		var1.set(12, 0); // L: 1099
		var1.set(13, 0); // L: 1100
		var1.set(14, 0); // L: 1101
		Date var2 = var1.getTime(); // L: 1102
		return var0.before(var2); // L: 1103
	}
}
