import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
public class class388 {
	@ObfuscatedName("v")
	float field4355;
	@ObfuscatedName("c")
	float field4357;
	@ObfuscatedName("i")
	float field4353;
	@ObfuscatedName("f")
	float field4354;
	@ObfuscatedName("b")
	float field4352;
	@ObfuscatedName("n")
	float field4356;
	@ObfuscatedName("s")
	float field4351;
	@ObfuscatedName("l")
	float field4360;
	@ObfuscatedName("q")
	float field4359;
	@ObfuscatedName("o")
	float field4362;
	@ObfuscatedName("r")
	float field4361;
	@ObfuscatedName("p")
	float field4358;

	static {
		new class388();
	}

	class388() {
		this.method7077();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1869591200"
	)
	void method7077() {
		this.field4358 = 0.0F;
		this.field4361 = 0.0F;
		this.field4362 = 0.0F;
		this.field4360 = 0.0F;
		this.field4351 = 0.0F;
		this.field4356 = 0.0F;
		this.field4354 = 0.0F;
		this.field4353 = 0.0F;
		this.field4357 = 0.0F;
		this.field4359 = 1.0F;
		this.field4352 = 1.0F;
		this.field4355 = 1.0F;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "1"
	)
	void method7078(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4357;
		float var5 = this.field4352;
		float var6 = this.field4360;
		float var7 = this.field4361;
		this.field4357 = var2 * var4 - this.field4353 * var3;
		this.field4353 = this.field4353 * var2 + var4 * var3;
		this.field4352 = var2 * var5 - this.field4356 * var3;
		this.field4356 = this.field4356 * var2 + var5 * var3;
		this.field4360 = var6 * var2 - var3 * this.field4359;
		this.field4359 = var2 * this.field4359 + var6 * var3;
		this.field4361 = var7 * var2 - var3 * this.field4358;
		this.field4358 = this.field4358 * var2 + var7 * var3;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-118819231"
	)
	void method7083(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4355;
		float var5 = this.field4354;
		float var6 = this.field4351;
		float var7 = this.field4362;
		this.field4355 = this.field4353 * var3 + var2 * var4;
		this.field4353 = this.field4353 * var2 - var4 * var3;
		this.field4354 = var2 * var5 + this.field4356 * var3;
		this.field4356 = this.field4356 * var2 - var5 * var3;
		this.field4351 = var6 * var2 + var3 * this.field4359;
		this.field4359 = this.field4359 * var2 - var3 * var6;
		this.field4362 = var3 * this.field4358 + var2 * var7;
		this.field4358 = this.field4358 * var2 - var7 * var3;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(FS)V",
		garbageValue = "9676"
	)
	void method7082(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4355;
		float var5 = this.field4354;
		float var6 = this.field4351;
		float var7 = this.field4362;
		this.field4355 = var4 * var2 - this.field4357 * var3;
		this.field4357 = this.field4357 * var2 + var4 * var3;
		this.field4354 = var2 * var5 - this.field4352 * var3;
		this.field4352 = var3 * var5 + this.field4352 * var2;
		this.field4351 = var6 * var2 - this.field4360 * var3;
		this.field4360 = var2 * this.field4360 + var6 * var3;
		this.field4362 = var2 * var7 - this.field4361 * var3;
		this.field4361 = var3 * var7 + this.field4361 * var2;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-1907030010"
	)
	void method7091(float var1, float var2, float var3) {
		this.field4362 += var1;
		this.field4361 += var2;
		this.field4358 += var3;
	}

	public String toString() {
		return this.field4355 + "," + this.field4354 + "," + this.field4351 + "," + this.field4362 + "\n" + this.field4357 + "," + this.field4352 + "," + this.field4360 + "," + this.field4361 + "\n" + this.field4353 + "," + this.field4356 + "," + this.field4359 + "," + this.field4358;
	}
}
