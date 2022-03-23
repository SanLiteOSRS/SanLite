import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nd")
@Implements("NameableContainer")
public abstract class NameableContainer {
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 2095812297
	)
	@Export("capacity")
	final int capacity;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 315027613
	)
	@Export("size")
	int size;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "[Lnc;"
	)
	@Export("array")
	Nameable[] array;
	@ObfuscatedName("x")
	@Export("usernamesMap")
	HashMap usernamesMap;
	@ObfuscatedName("c")
	@Export("previousUsernamesMap")
	HashMap previousUsernamesMap;
	@ObfuscatedName("j")
	@Export("comparator")
	Comparator comparator;

	NameableContainer(int var1) {
		this.size = 0;
		this.comparator = null;
		this.capacity = var1;
		this.array = this.newTypedArray(var1);
		this.usernamesMap = new HashMap(var1 / 8);
		this.previousUsernamesMap = new HashMap(var1 / 8);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lnc;",
		garbageValue = "-1289438305"
	)
	@Export("newInstance")
	abstract Nameable newInstance();

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)[Lnc;",
		garbageValue = "-1075861644"
	)
	@Export("newTypedArray")
	abstract Nameable[] newTypedArray(int var1);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "53"
	)
	@Export("clear")
	public void clear() {
		this.size = 0;
		Arrays.fill(this.array, (Object)null);
		this.usernamesMap.clear();
		this.previousUsernamesMap.clear();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-7"
	)
	@Export("getSize")
	public int getSize() {
		return this.size;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-33"
	)
	@Export("isFull")
	public boolean isFull() {
		return this.capacity == this.size;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lqy;B)Z",
		garbageValue = "40"
	)
	@Export("contains")
	public boolean contains(Username var1) {
		if (!var1.hasCleanName()) {
			return false;
		} else {
			return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)Lnc;",
		garbageValue = "-1870974615"
	)
	@Export("getByUsername")
	public Nameable getByUsername(Username var1) {
		Nameable var2 = this.getByCurrentUsername(var1);
		return var2 != null ? var2 : this.getByPreviousUsername(var1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)Lnc;",
		garbageValue = "1018627440"
	)
	@Export("getByCurrentUsername")
	Nameable getByCurrentUsername(Username var1) {
		return !var1.hasCleanName() ? null : (Nameable)this.usernamesMap.get(var1);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)Lnc;",
		garbageValue = "-927262844"
	)
	@Export("getByPreviousUsername")
	Nameable getByPreviousUsername(Username var1) {
		return !var1.hasCleanName() ? null : (Nameable)this.previousUsernamesMap.get(var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lqy;B)Z",
		garbageValue = "3"
	)
	@Export("removeByUsername")
	public final boolean removeByUsername(Username var1) {
		Nameable var2 = this.getByCurrentUsername(var1);
		if (var2 == null) {
			return false;
		} else {
			this.remove(var2);
			return true;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lnc;I)V",
		garbageValue = "639467139"
	)
	@Export("remove")
	final void remove(Nameable var1) {
		int var2 = this.indexOf(var1);
		if (var2 != -1) {
			this.arrayRemove(var2);
			this.mapRemove(var1);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)Lnc;",
		garbageValue = "455290371"
	)
	@Export("addLastNoPreviousUsername")
	Nameable addLastNoPreviousUsername(Username var1) {
		return this.addLast(var1, (Username)null);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqy;Lqy;I)Lnc;",
		garbageValue = "1062950692"
	)
	@Export("addLast")
	Nameable addLast(Username var1, Username var2) {
		Nameable var3 = this.newInstance();
		var3.set(var1, var2);
		this.arrayAddLast(var3);
		this.mapPut(var3);
		return var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lnc;",
		garbageValue = "-1217975743"
	)
	@Export("get")
	public final Nameable get(int var1) {
		if (var1 >= 0 && var1 < this.size) {
			return this.array[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1123073588"
	)
	@Export("sort")
	public final void sort() {
		if (this.comparator == null) {
			Arrays.sort(this.array, 0, this.size);
		} else {
			Arrays.sort(this.array, 0, this.size, this.comparator);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lnc;Lqy;Lqy;B)V",
		garbageValue = "-36"
	)
	@Export("changeName")
	final void changeName(Nameable var1, Username var2, Username var3) {
		this.mapRemove(var1);
		var1.set(var2, var3);
		this.mapPut(var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lnc;B)I",
		garbageValue = "13"
	)
	@Export("indexOf")
	final int indexOf(Nameable var1) {
		for (int var2 = 0; var2 < this.size; ++var2) {
			if (this.array[var2] == var1) {
				return var2;
			}
		}

		return -1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lnc;I)V",
		garbageValue = "2034975080"
	)
	@Export("mapRemove")
	final void mapRemove(Nameable var1) {
		if (this.usernamesMap.remove(var1.username) == null) {
			throw new IllegalStateException();
		} else {
			if (var1.previousUsername != null) {
				this.previousUsernamesMap.remove(var1.previousUsername);
			}

		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lnc;B)V",
		garbageValue = "-30"
	)
	@Export("arrayAddLast")
	final void arrayAddLast(Nameable var1) {
		this.array[++this.size - 1] = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lnc;I)V",
		garbageValue = "1365835101"
	)
	@Export("mapPut")
	final void mapPut(Nameable var1) {
		this.usernamesMap.put(var1.username, var1);
		if (var1.previousUsername != null) {
			Nameable var2 = (Nameable)this.previousUsernamesMap.put(var1.previousUsername, var1);
			if (var2 != null && var2 != var1) {
				var2.previousUsername = null;
			}
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1802337929"
	)
	@Export("arrayRemove")
	final void arrayRemove(int var1) {
		--this.size;
		if (var1 < this.size) {
			System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1);
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2047830543"
	)
	@Export("removeComparator")
	public final void removeComparator() {
		this.comparator = null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;B)V",
		garbageValue = "6"
	)
	@Export("addComparator")
	public final void addComparator(Comparator var1) {
		if (this.comparator == null) {
			this.comparator = var1;
		} else if (this.comparator instanceof AbstractUserComparator) {
			((AbstractUserComparator)this.comparator).addComparator(var1);
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Llq;IIB)[Lql;",
		garbageValue = "10"
	)
	public static SpritePixels[] method6853(AbstractArchive var0, int var1, int var2) {
		return !GrandExchangeEvent.SpriteBuffer_loadSpritesFromArchive(var0, var1, var2) ? null : class435.method7695();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lna;FFFI)F",
		garbageValue = "-1623285058"
	)
	static float method6823(class389 var0, float var1, float var2, float var3) {
		float var4 = MidiPcmStream.method5405(var0.field4363, var0.field4366, var1);
		if (Math.abs(var4) < class114.field1396) {
			return var1;
		} else {
			float var5 = MidiPcmStream.method5405(var0.field4363, var0.field4366, var2);
			if (Math.abs(var5) < class114.field1396) {
				return var2;
			} else {
				float var6 = 0.0F;
				float var7 = 0.0F;
				float var8 = 0.0F;
				float var13 = 0.0F;
				boolean var14 = true;
				boolean var15 = false;

				do {
					var15 = false;
					if (var14) {
						var6 = var1;
						var13 = var4;
						var7 = var2 - var1;
						var8 = var7;
						var14 = false;
					}

					if (Math.abs(var13) < Math.abs(var5)) {
						var1 = var2;
						var2 = var6;
						var6 = var1;
						var4 = var5;
						var5 = var13;
						var13 = var4;
					}

					float var16 = class114.field1394 * Math.abs(var2) + var3 * 0.5F;
					float var17 = 0.5F * (var6 - var2);
					boolean var18 = Math.abs(var17) > var16 && var5 != 0.0F;
					if (var18) {
						if (Math.abs(var8) >= var16 && Math.abs(var4) > Math.abs(var5)) {
							float var12 = var5 / var4;
							float var9;
							float var10;
							if (var6 == var1) {
								var9 = 2.0F * var17 * var12;
								var10 = 1.0F - var12;
							} else {
								var10 = var4 / var13;
								float var11 = var5 / var13;
								var9 = ((var10 - var11) * var10 * var17 * 2.0F - (var11 - 1.0F) * (var2 - var1)) * var12;
								var10 = (var12 - 1.0F) * (var10 - 1.0F) * (var11 - 1.0F);
							}

							if ((double)var9 > 0.0D) {
								var10 = -var10;
							} else {
								var9 = -var9;
							}

							var12 = var8;
							var8 = var7;
							if (var9 * 2.0F < var17 * 3.0F * var10 - Math.abs(var10 * var16) && var9 < Math.abs(var12 * 0.5F * var10)) {
								var7 = var9 / var10;
							} else {
								var7 = var17;
								var8 = var17;
							}
						} else {
							var7 = var17;
							var8 = var17;
						}

						var1 = var2;
						var4 = var5;
						if (Math.abs(var7) > var16) {
							var2 += var7;
						} else if ((double)var17 > 0.0D) {
							var2 += var16;
						} else {
							var2 -= var16;
						}

						var5 = MidiPcmStream.method5405(var0.field4363, var0.field4366, var2);
						if ((double)(var5 * (var13 / Math.abs(var13))) > 0.0D) {
							var14 = true;
							var15 = true;
						} else {
							var15 = true;
						}
					}
				} while(var15);

				return var2;
			}
		}
	}
}
