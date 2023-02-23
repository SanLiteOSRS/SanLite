import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("om")
@Implements("IgnoreList")
public class IgnoreList extends NameableContainer {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	@Export("loginType")
	final LoginType loginType;

	@ObfuscatedSignature(
		descriptor = "(Lqj;)V"
	)
	public IgnoreList(LoginType var1) {
		super(400); // L: 13
		this.loginType = var1; // L: 14
	} // L: 15

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Low;",
		garbageValue = "-2146736820"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new Ignored(); // L: 19
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)[Low;",
		garbageValue = "1411048209"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new Ignored[var1]; // L: 24
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lrd;IB)V",
		garbageValue = "10"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (true) {
			if (var1.offset < var2) { // L: 28
				int var3 = var1.readUnsignedByte(); // L: 29
				boolean var4 = (var3 & 1) == 1; // L: 30
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 31
				Username var6 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 32
				var1.readStringCp1252NullTerminated(); // L: 33
				if (var5 != null && var5.hasCleanName()) { // L: 34
					Ignored var7 = (Ignored)this.getByCurrentUsername(var5); // L: 35
					if (var4) { // L: 36
						Ignored var8 = (Ignored)this.getByCurrentUsername(var6); // L: 37
						if (var8 != null && var8 != var7) { // L: 38
							if (var7 != null) { // L: 39
								this.remove(var8); // L: 40
							} else {
								var7 = var8; // L: 43
							}
						}
					}

					if (var7 != null) {
						this.changeName(var7, var5, var6);
						continue;
					}

					if (this.getSize() < 400) { // L: 50
						int var9 = this.getSize();
						var7 = (Ignored)this.addLast(var5, var6);
						var7.id = var9; // L: 53
					}
					continue;
				}

				throw new IllegalStateException(); // L: 56
			}

			return; // L: 57
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-1742873444"
	)
	public static int method7524(byte[] var0, int var1, int var2) {
		int var3 = -1; // L: 47

		for (int var4 = var1; var4 < var2; ++var4) { // L: 48
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255]; // L: 49
		}

		var3 = ~var3; // L: 51
		return var3; // L: 52
	}
}
