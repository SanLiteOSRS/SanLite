import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("fm")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "[Lrs;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	@ObfuscatedName("f")
	boolean field1789;
	@ObfuscatedName("w")
	boolean field1790;
	@ObfuscatedName("v")
	@Export("members")
	public List members;
	@ObfuscatedName("s")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		longValue = 5364181956474599071L
	)
	long field1792;
	@ObfuscatedName("j")
	@Export("name")
	public String name;
	@ObfuscatedName("i")
	public byte field1794;
	@ObfuscatedName("n")
	public byte field1795;

	static {
		new BitSet(65536); // L: 22
	} // L: 23

	@ObfuscatedSignature(
		descriptor = "(Lrd;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1790 = true; // L: 13
		this.name = null;
		this.method3358(var1); // L: 26
	} // L: 27

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1723200754"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method9270();
			}

			int[] var3 = this.sortedMembers; // L: 37
			GameObject.method4867(var1, var3, 0, var1.length - 1);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Leu;I)V",
		garbageValue = "-758878496"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "555394235"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1410246446"
	)
	public int method3359() {
		return this.members.size(); // L: 56
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1403435535"
	)
	public int method3357(String var1) {
		if (!this.field1790) {
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.members.size(); ++var2) {
				if (((ClanChannelMember)this.members.get(var2)).username.getName().equalsIgnoreCase(var1)) {
					return var2;
				}
			}

			return -1; // L: 64
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)V",
		garbageValue = "188484319"
	)
	void method3358(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field1789 = true;
		}

		if ((var2 & 2) != 0) { // L: 70
			this.field1790 = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field1792 = var1.readLong(); // L: 74
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean(); // L: 76
		this.field1795 = var1.readByte();
		this.field1794 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) { // L: 82
				ClanChannelMember var6 = new ClanChannelMember(); // L: 83
				if (this.field1789) {
					var1.readLong();
				}

				if (this.field1790) {
					var6.username = new Username(var1.readStringCp1252NullTerminated());
				}

				var6.rank = var1.readByte();
				var6.world = var1.readUnsignedShort(); // L: 89
				if (var3 >= 3) {
					var1.readBoolean();
				}

				this.members.add(var5, var6);
			}
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lru;I)V",
		garbageValue = "-573182363"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class36.reflectionChecks.last(); // L: 29
		if (var1 != null) { // L: 30
			int var2 = var0.offset; // L: 31
			var0.writeInt(var1.id); // L: 32

			for (int var3 = 0; var3 < var1.size; ++var3) { // L: 33
				if (var1.creationErrors[var3] != 0) { // L: 34
					var0.writeByte(var1.creationErrors[var3]); // L: 35
				} else {
					try {
						int var4 = var1.operations[var3]; // L: 39
						Field var5;
						int var6;
						if (var4 == 0) { // L: 40
							var5 = var1.fields[var3]; // L: 41
							var6 = Reflection.getInt(var5, (Object)null); // L: 42
							var0.writeByte(0); // L: 43
							var0.writeInt(var6); // L: 44
						} else if (var4 == 1) { // L: 46
							var5 = var1.fields[var3]; // L: 47
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]); // L: 48
							var0.writeByte(0); // L: 49
						} else if (var4 == 2) { // L: 51
							var5 = var1.fields[var3]; // L: 52
							var6 = var5.getModifiers(); // L: 53
							var0.writeByte(0); // L: 54
							var0.writeInt(var6); // L: 55
						}

						Method var25;
						if (var4 != 3) { // L: 57
							if (var4 == 4) { // L: 77
								var25 = var1.methods[var3]; // L: 78
								var6 = var25.getModifiers(); // L: 79
								var0.writeByte(0); // L: 80
								var0.writeInt(var6); // L: 81
							}
						} else {
							var25 = var1.methods[var3]; // L: 58
							byte[][] var10 = var1.arguments[var3]; // L: 59
							Object[] var7 = new Object[var10.length]; // L: 60

							for (int var8 = 0; var8 < var10.length; ++var8) { // L: 61
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8])); // L: 62
								var7[var8] = var9.readObject(); // L: 63
							}

							Object var11 = Reflection.invoke(var25, (Object)null, var7); // L: 65
							if (var11 == null) { // L: 66
								var0.writeByte(0);
							} else if (var11 instanceof Number) { // L: 67
								var0.writeByte(1); // L: 68
								var0.writeLong(((Number)var11).longValue()); // L: 69
							} else if (var11 instanceof String) { // L: 71
								var0.writeByte(2); // L: 72
								var0.writeStringCp1252NullTerminated((String)var11); // L: 73
							} else {
								var0.writeByte(4); // L: 75
							}
						}
					} catch (ClassNotFoundException var13) { // L: 84
						var0.writeByte(-10); // L: 85
					} catch (InvalidClassException var14) { // L: 87
						var0.writeByte(-11); // L: 88
					} catch (StreamCorruptedException var15) { // L: 90
						var0.writeByte(-12); // L: 91
					} catch (OptionalDataException var16) { // L: 93
						var0.writeByte(-13); // L: 94
					} catch (IllegalAccessException var17) { // L: 96
						var0.writeByte(-14); // L: 97
					} catch (IllegalArgumentException var18) { // L: 99
						var0.writeByte(-15); // L: 100
					} catch (InvocationTargetException var19) { // L: 102
						var0.writeByte(-16); // L: 103
					} catch (SecurityException var20) { // L: 105
						var0.writeByte(-17); // L: 106
					} catch (IOException var21) { // L: 108
						var0.writeByte(-18); // L: 109
					} catch (NullPointerException var22) { // L: 111
						var0.writeByte(-19); // L: 112
					} catch (Exception var23) { // L: 114
						var0.writeByte(-20); // L: 115
					} catch (Throwable var24) { // L: 117
						var0.writeByte(-21); // L: 118
					}
				}
			}

			var0.writeCrc(var2); // L: 121
			var1.remove(); // L: 122
		}
	} // L: 123

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "249976305"
	)
	public static int method3366(int var0) {
		return var0 >> 17 & 7; // L: 17
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "25"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = class135.getWidgetChild(var0, var1); // L: 10267
		if (var4 != null && var4.onTargetEnter != null) { // L: 10268
			ScriptEvent var5 = new ScriptEvent(); // L: 10269
			var5.widget = var4; // L: 10270
			var5.args = var4.onTargetEnter; // L: 10271
			WorldMapAreaData.runScriptEvent(var5); // L: 10272
		}

		Client.selectedSpellItemId = var3; // L: 10274
		Client.isSpellSelected = true; // L: 10275
		class9.selectedSpellWidget = var0; // L: 10276
		Client.selectedSpellChildIndex = var1; // L: 10277
		class149.selectedSpellFlags = var2; // L: 10278
		LoginScreenAnimation.invalidateWidget(var4); // L: 10279
	} // L: 10280
}
