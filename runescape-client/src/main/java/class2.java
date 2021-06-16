import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("v")
public class class2 {
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1819318139
	)
	static int field20;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -5109163209193777569L
	)
	long field18;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1849981899
	)
	int field13;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	IterableNodeDeque field14;

	@ObfuscatedSignature(
		descriptor = "(Lnt;)V"
	)
	public class2(Buffer var1) {
		this.field13 = -1;
		this.field14 = new IterableNodeDeque();
		this.method23(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "834353065"
	)
	void method23(Buffer var1) {
		this.field18 = var1.readLong();
		this.field13 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class13(this);
			} else if (var2 == 1) {
				var3 = new class8(this);
			} else if (var2 == 13) {
				var3 = new class26(this);
			} else if (var2 == 4) {
				var3 = new class17(this);
			} else if (var2 == 6) {
				var3 = new class10(this);
			} else if (var2 == 5) {
				var3 = new class22(this);
			} else if (var2 == 2) {
				var3 = new class23(this);
			} else if (var2 == 7) {
				var3 = new class21(this);
			} else if (var2 == 14) {
				var3 = new class18(this);
			} else if (var2 == 8) {
				var3 = new class6(this);
			} else if (var2 == 9) {
				var3 = new class0(this);
			} else if (var2 == 10) {
				var3 = new class4(this);
			} else if (var2 == 11) {
				var3 = new class1(this);
			} else if (var2 == 12) {
				var3 = new class15(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class27(this);
			}

			((class14)var3).vmethod363(var1);
			this.field14.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lb;B)V",
		garbageValue = "-59"
	)
	public void method24(ClanSettings var1) {
		if (var1.field82 == this.field18 && this.field13 == var1.field83) {
			for (class14 var2 = (class14)this.field14.last(); var2 != null; var2 = (class14)this.field14.previous()) {
				var2.vmethod354(var1);
			}

			++var1.field83;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "8"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		PcmPlayer.logOut();
		switch(var0) {
		case 1:
			Login.loginIndex = 24;
			CollisionMap.setLoginResponseString("", "You were disconnected from the server.", "");
			break;
		case 2:
			GameObject.method4432();
		}

	}
}
