import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oe")
@Implements("FriendsList")
public class FriendsList extends NameableContainer {
	@ObfuscatedName("j")
	@Export("SpriteBuffer_spriteWidths")
	public static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("ac")
	protected static String field4540;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -893041511
	)
	int field4541;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("friendLoginUpdates")
	public LinkDeque friendLoginUpdates;

	@ObfuscatedSignature(
		descriptor = "(Lqj;)V"
	)
	public FriendsList(LoginType var1) {
		super(400); // L: 18
		this.field4541 = 1; // L: 14
		this.friendLoginUpdates = new LinkDeque(); // L: 15
		this.loginType = var1; // L: 19
	} // L: 20

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Low;",
		garbageValue = "-2146736820"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new Friend(); // L: 24
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)[Low;",
		garbageValue = "1411048209"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new Friend[var1]; // L: 29
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lsi;ZI)Z",
		garbageValue = "-890591527"
	)
	@Export("isFriended")
	public boolean isFriended(Username var1, boolean var2) {
		Friend var3 = (Friend)this.getByUsername(var1); // L: 33
		if (var3 == null) {
			return false; // L: 34
		} else {
			return !var2 || var3.world != 0; // L: 35
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lrd;II)V",
		garbageValue = "-1435809245"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (true) {
			if (var1.offset < var2) { // L: 40
				boolean var3 = var1.readUnsignedByte() == 1; // L: 41
				Username var4 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 42
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 43
				int var6 = var1.readUnsignedShort(); // L: 44
				int var7 = var1.readUnsignedByte(); // L: 45
				int var8 = var1.readUnsignedByte(); // L: 46
				boolean var9 = (var8 & 2) != 0; // L: 47
				boolean var10 = (var8 & 1) != 0; // L: 48
				if (var6 > 0) { // L: 49
					var1.readStringCp1252NullTerminated(); // L: 50
					var1.readUnsignedByte(); // L: 51
					var1.readInt(); // L: 52
				}

				var1.readStringCp1252NullTerminated(); // L: 54
				if (var4 != null && var4.hasCleanName()) { // L: 55
					Friend var11 = (Friend)this.getByCurrentUsername(var4); // L: 56
					if (var3) { // L: 57
						Friend var12 = (Friend)this.getByCurrentUsername(var5); // L: 58
						if (var12 != null && var11 != var12) { // L: 59
							if (var11 != null) { // L: 60
								this.remove(var12); // L: 61
							} else {
								var11 = var12; // L: 64
							}
						}
					}

					if (var11 != null) { // L: 68
						this.changeName(var11, var4, var5); // L: 69
						if (var6 != var11.world) { // L: 70
							boolean var14 = true; // L: 71

							for (FriendLoginUpdate var13 = (FriendLoginUpdate)this.friendLoginUpdates.last(); var13 != null; var13 = (FriendLoginUpdate)this.friendLoginUpdates.previous()) { // L: 72
								if (var13.username.equals(var4)) { // L: 73
									if (var6 != 0 && var13.world == 0) { // L: 74
										var13.remove(); // L: 75
										var14 = false; // L: 76
									} else if (var6 == 0 && var13.world != 0) { // L: 78
										var13.remove(); // L: 79
										var14 = false; // L: 80
									}
								}
							}

							if (var14) { // L: 84
								this.friendLoginUpdates.addFirst(new FriendLoginUpdate(var4, var6));
							}
						}
					} else {
						if (this.getSize() >= 400) { // L: 87
							continue;
						}

						var11 = (Friend)this.addLast(var4, var5); // L: 88
					}

					if (var6 != var11.world) { // L: 91
						var11.int2 = ++this.field4541 - 1; // L: 92
						if (var11.world == -1 && var6 == 0) { // L: 93
							var11.int2 = -(var11.int2 * -801801849) * 143588407;
						}

						var11.world = var6; // L: 94
					}

					var11.rank = var7; // L: 96
					var11.field4553 = var9; // L: 97
					var11.field4552 = var10; // L: 98
					continue; // L: 99
				}

				throw new IllegalStateException();
			}

			this.sort(); // L: 100
			return; // L: 101
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lqn;I)Ljava/lang/Object;",
		garbageValue = "2113318877"
	)
	static Object method7543(class463 var0) {
		if (var0 == null) { // L: 5130
			throw new IllegalStateException("popValueOfType() failure - null baseVarType"); // L: 5131
		} else {
			switch(var0.field4899) { // L: 5133
			case 1:
				return Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 5137
			case 2:
				return Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 5139
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type"); // L: 5135
			}
		}
	}
}
