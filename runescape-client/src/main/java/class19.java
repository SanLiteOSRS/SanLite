import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("x")
public class class19 {
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -7800373263393014969L
	)
	long field162;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = 2996578654687834529L
	)
	long field160;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	IterableNodeDeque field163;

	@ObfuscatedSignature(
		descriptor = "(Lnd;)V"
	)
	public class19(Buffer var1) {
		this.field160 = -1L;
		this.field163 = new IterableNodeDeque();
		this.method221(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1275623765"
	)
	void method221(Buffer var1) {
		this.field162 = var1.readLong();
		this.field160 = var1.readLong();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class12(this);
			} else if (var2 == 4) {
				var3 = new class7(this);
			} else if (var2 == 3) {
				var3 = new class5(this);
			} else if (var2 == 2) {
				var3 = new class20(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new class25(this);
			}

			((class16)var3).vmethod266(var1);
			this.field163.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ly;I)V",
		garbageValue = "205429833"
	)
	public void method218(class3 var1) {
		if (var1.key == this.field162 && var1.field29 == this.field160) {
			for (class16 var2 = (class16)this.field163.last(); var2 != null; var2 = (class16)this.field163.previous()) {
				var2.vmethod264(var1);
			}

			++var1.field29;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lbh;I)V",
		garbageValue = "229174712"
	)
	public static final void method225(class60 var0) {
		class26.pcmPlayerProvider = var0;
	}
}
