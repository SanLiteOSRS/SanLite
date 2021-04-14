import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("f")
	int field444;
	@ObfuscatedName("o")
	int field443;
	@ObfuscatedName("u")
	int field440;
	@ObfuscatedName("p")
	int field441;
	@ObfuscatedName("b")
	int field442;
	@ObfuscatedName("e")
	int field451;
	@ObfuscatedName("k")
	int field448;
	@ObfuscatedName("g")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("h")
	@Export("start")
	int start;
	@ObfuscatedName("n")
	@Export("end")
	int end;
	@ObfuscatedName("l")
	boolean field439;
	@ObfuscatedName("m")
	int field447;
	@ObfuscatedName("d")
	int field450;
	@ObfuscatedName("c")
	int field438;
	@ObfuscatedName("j")
	int field452;

	@ObfuscatedSignature(
		signature = "(Lah;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field439 = var1.field370;
		this.field443 = var2;
		this.field440 = var3;
		this.field441 = var4;
		this.field444 = 0;
		this.method899();
	}

	@ObfuscatedSignature(
		signature = "(Lah;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field439 = var1.field370;
		this.field443 = var2;
		this.field440 = var3;
		this.field441 = 8192;
		this.field444 = 0;
		this.method899();
	}

	@ObfuscatedName("b")
	void method899() {
		this.field442 = this.field440;
		this.field451 = method896(this.field440, this.field441);
		this.field448 = method894(this.field440, this.field441);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "()Lbt;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "()Lbt;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("g")
	protected int vmethod4124() {
		return this.field440 == 0 && this.field447 == 0 ? 0 : 1;
	}

	@ObfuscatedName("h")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field440 == 0 && this.field447 == 0) {
			this.skip(var3);
		} else {
			RawSound var4 = (RawSound)super.sound;
			int var5 = this.start << 8;
			int var6 = this.end << 8;
			int var7 = var4.samples.length << 8;
			int var8 = var6 - var5;
			if (var8 <= 0) {
				this.numLoops = 0;
			}

			int var9 = var2;
			var3 += var2;
			if (this.field444 < 0) {
				if (this.field443 <= 0) {
					this.method908();
					this.remove();
					return;
				}

				this.field444 = 0;
			}

			if (this.field444 >= var7) {
				if (this.field443 >= 0) {
					this.method908();
					this.remove();
					return;
				}

				this.field444 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field439) {
					if (this.field443 < 0) {
						var9 = this.method922(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field444 >= var5) {
							return;
						}

						this.field444 = var5 + var5 - 1 - this.field444;
						this.field443 = -this.field443;
					}

					while (true) {
						var9 = this.method921(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field444 < var6) {
							return;
						}

						this.field444 = var6 + var6 - 1 - this.field444;
						this.field443 = -this.field443;
						var9 = this.method922(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field444 >= var5) {
							return;
						}

						this.field444 = var5 + var5 - 1 - this.field444;
						this.field443 = -this.field443;
					}
				} else if (this.field443 < 0) {
					while (true) {
						var9 = this.method922(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field444 >= var5) {
							return;
						}

						this.field444 = var6 - 1 - (var6 - 1 - this.field444) % var8;
					}
				} else {
					while (true) {
						var9 = this.method921(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field444 < var6) {
							return;
						}

						this.field444 = var5 + (this.field444 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field439) {
						label155: {
							if (this.field443 < 0) {
								var9 = this.method922(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field444 >= var5) {
									return;
								}

								this.field444 = var5 + var5 - 1 - this.field444;
								this.field443 = -this.field443;
								if (--this.numLoops == 0) {
									break label155;
								}
							}

							do {
								var9 = this.method921(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field444 < var6) {
									return;
								}

								this.field444 = var6 + var6 - 1 - this.field444;
								this.field443 = -this.field443;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method922(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field444 >= var5) {
									return;
								}

								this.field444 = var5 + var5 - 1 - this.field444;
								this.field443 = -this.field443;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field443 < 0) {
							while (true) {
								var9 = this.method922(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field444 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field444) / var8;
								if (var10 >= this.numLoops) {
									this.field444 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field444 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method921(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field444 < var6) {
									return;
								}

								var10 = (this.field444 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field444 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field444 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field443 < 0) {
					this.method922(var1, var9, 0, var3, 0);
					if (this.field444 < 0) {
						this.field444 = -1;
						this.method908();
						this.remove();
					}
				} else {
					this.method921(var1, var9, var7, var3, 0);
					if (this.field444 >= var7) {
						this.field444 = var7;
						this.method908();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("n")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("l")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field447 > 0) {
			if (var1 >= this.field447) {
				if (this.field440 == Integer.MIN_VALUE) {
					this.field440 = 0;
					this.field448 = 0;
					this.field451 = 0;
					this.field442 = 0;
					this.remove();
					var1 = this.field447;
				}

				this.field447 = 0;
				this.method899();
			} else {
				this.field442 += this.field450 * var1;
				this.field451 += this.field438 * var1;
				this.field448 += this.field452 * var1;
				this.field447 -= var1;
			}
		}

		RawSound var2 = (RawSound)super.sound;
		int var3 = this.start << 8;
		int var4 = this.end << 8;
		int var5 = var2.samples.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.numLoops = 0;
		}

		if (this.field444 < 0) {
			if (this.field443 <= 0) {
				this.method908();
				this.remove();
				return;
			}

			this.field444 = 0;
		}

		if (this.field444 >= var5) {
			if (this.field443 >= 0) {
				this.method908();
				this.remove();
				return;
			}

			this.field444 = var5 - 1;
		}

		this.field444 += this.field443 * var1;
		if (this.numLoops < 0) {
			if (!this.field439) {
				if (this.field443 < 0) {
					if (this.field444 >= var3) {
						return;
					}

					this.field444 = var4 - 1 - (var4 - 1 - this.field444) % var6;
				} else {
					if (this.field444 < var4) {
						return;
					}

					this.field444 = var3 + (this.field444 - var3) % var6;
				}

			} else {
				if (this.field443 < 0) {
					if (this.field444 >= var3) {
						return;
					}

					this.field444 = var3 + var3 - 1 - this.field444;
					this.field443 = -this.field443;
				}

				while (this.field444 >= var4) {
					this.field444 = var4 + var4 - 1 - this.field444;
					this.field443 = -this.field443;
					if (this.field444 >= var3) {
						return;
					}

					this.field444 = var3 + var3 - 1 - this.field444;
					this.field443 = -this.field443;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field439) {
					label134: {
						if (this.field443 < 0) {
							if (this.field444 >= var3) {
								return;
							}

							this.field444 = var3 + var3 - 1 - this.field444;
							this.field443 = -this.field443;
							if (--this.numLoops == 0) {
								break label134;
							}
						}

						do {
							if (this.field444 < var4) {
								return;
							}

							this.field444 = var4 + var4 - 1 - this.field444;
							this.field443 = -this.field443;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field444 >= var3) {
								return;
							}

							this.field444 = var3 + var3 - 1 - this.field444;
							this.field443 = -this.field443;
						} while(--this.numLoops != 0);
					}
				} else {
					label166: {
						int var7;
						if (this.field443 < 0) {
							if (this.field444 >= var3) {
								return;
							}

							var7 = (var4 - 1 - this.field444) / var6;
							if (var7 >= this.numLoops) {
								this.field444 += var6 * this.numLoops;
								this.numLoops = 0;
								break label166;
							}

							this.field444 += var6 * var7;
							this.numLoops -= var7;
						} else {
							if (this.field444 < var4) {
								return;
							}

							var7 = (this.field444 - var3) / var6;
							if (var7 >= this.numLoops) {
								this.field444 -= var6 * this.numLoops;
								this.numLoops = 0;
								break label166;
							}

							this.field444 -= var6 * var7;
							this.numLoops -= var7;
						}

						return;
					}
				}
			}

			if (this.field443 < 0) {
				if (this.field444 < 0) {
					this.field444 = -1;
					this.method908();
					this.remove();
				}
			} else if (this.field444 >= var5) {
				this.field444 = var5;
				this.method908();
				this.remove();
			}

		}
	}

	@ObfuscatedName("m")
	public synchronized void method901(int var1) {
		this.method916(var1 << 6, this.method905());
	}

	@ObfuscatedName("d")
	synchronized void method937(int var1) {
		this.method916(var1, this.method905());
	}

	@ObfuscatedName("c")
	synchronized void method916(int var1, int var2) {
		this.field440 = var1;
		this.field441 = var2;
		this.field447 = 0;
		this.method899();
	}

	@ObfuscatedName("j")
	public synchronized int method904() {
		return this.field440 == Integer.MIN_VALUE ? 0 : this.field440;
	}

	@ObfuscatedName("r")
	public synchronized int method905() {
		return this.field441 < 0 ? -1 : this.field441;
	}

	@ObfuscatedName("q")
	public synchronized void method906(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field444 = var1;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method907() {
		this.field443 = (this.field443 ^ this.field443 >> 31) + (this.field443 >>> 31);
		this.field443 = -this.field443;
	}

	@ObfuscatedName("v")
	void method908() {
		if (this.field447 != 0) {
			if (this.field440 == Integer.MIN_VALUE) {
				this.field440 = 0;
			}

			this.field447 = 0;
			this.method899();
		}

	}

	@ObfuscatedName("x")
	public synchronized void method909(int var1, int var2) {
		this.method910(var1, var2, this.method905());
	}

	@ObfuscatedName("z")
	public synchronized void method910(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method916(var2, var3);
		} else {
			int var4 = method896(var2, var3);
			int var5 = method894(var2, var3);
			if (var4 == this.field451 && var5 == this.field448) {
				this.field447 = 0;
			} else {
				int var6 = var2 - this.field442;
				if (this.field442 - var2 > var6) {
					var6 = this.field442 - var2;
				}

				if (var4 - this.field451 > var6) {
					var6 = var4 - this.field451;
				}

				if (this.field451 - var4 > var6) {
					var6 = this.field451 - var4;
				}

				if (var5 - this.field448 > var6) {
					var6 = var5 - this.field448;
				}

				if (this.field448 - var5 > var6) {
					var6 = this.field448 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field447 = var1;
				this.field440 = var2;
				this.field441 = var3;
				this.field450 = (var2 - this.field442) / var1;
				this.field438 = (var4 - this.field451) / var1;
				this.field452 = (var5 - this.field448) / var1;
			}
		}
	}

	@ObfuscatedName("at")
	public synchronized void method920(int var1) {
		if (var1 == 0) {
			this.method937(0);
			this.remove();
		} else if (this.field451 == 0 && this.field448 == 0) {
			this.field447 = 0;
			this.field440 = 0;
			this.field442 = 0;
			this.remove();
		} else {
			int var2 = -this.field442;
			if (this.field442 > var2) {
				var2 = this.field442;
			}

			if (-this.field451 > var2) {
				var2 = -this.field451;
			}

			if (this.field451 > var2) {
				var2 = this.field451;
			}

			if (-this.field448 > var2) {
				var2 = -this.field448;
			}

			if (this.field448 > var2) {
				var2 = this.field448;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field447 = var1;
			this.field440 = Integer.MIN_VALUE;
			this.field450 = -this.field442 / var1;
			this.field438 = -this.field451 / var1;
			this.field452 = -this.field448 / var1;
		}
	}

	@ObfuscatedName("aj")
	public synchronized void method912(int var1) {
		if (this.field443 < 0) {
			this.field443 = -var1;
		} else {
			this.field443 = var1;
		}

	}

	@ObfuscatedName("ax")
	public synchronized int method981() {
		return this.field443 < 0 ? -this.field443 : this.field443;
	}

	@ObfuscatedName("as")
	public boolean method973() {
		return this.field444 < 0 || this.field444 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("ad")
	public boolean method941() {
		return this.field447 != 0;
	}

	@ObfuscatedName("af")
	int vmethod1039() {
		int var1 = this.field442 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field444 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("ao")
	int method921(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field447 > 0) {
				int var6 = var2 + this.field447;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field447 += var2;
				if (this.field443 == 256 && (this.field444 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method933(0, ((RawSound)super.sound).samples, var1, this.field444, var2, this.field451, this.field448, this.field438, this.field452, 0, var6, var3, this);
					} else {
						var2 = method932(((RawSound)super.sound).samples, var1, this.field444, var2, this.field442, this.field450, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method1008(0, 0, ((RawSound)super.sound).samples, var1, this.field444, var2, this.field451, this.field448, this.field438, this.field452, 0, var6, var3, this, this.field443, var5);
				} else {
					var2 = method936(0, 0, ((RawSound)super.sound).samples, var1, this.field444, var2, this.field442, this.field450, 0, var6, var3, this, this.field443, var5);
				}

				this.field447 -= var2;
				if (this.field447 != 0) {
					return var2;
				}

				if (!this.method923()) {
					continue;
				}

				return var4;
			}

			if (this.field443 == 256 && (this.field444 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method925(0, ((RawSound)super.sound).samples, var1, this.field444, var2, this.field451, this.field448, 0, var4, var3, this);
				}

				return method924(((RawSound)super.sound).samples, var1, this.field444, var2, this.field442, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method929(0, 0, ((RawSound)super.sound).samples, var1, this.field444, var2, this.field451, this.field448, 0, var4, var3, this, this.field443, var5);
			}

			return method928(0, 0, ((RawSound)super.sound).samples, var1, this.field444, var2, this.field442, 0, var4, var3, this, this.field443, var5);
		}
	}

	@ObfuscatedName("ai")
	int method922(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field447 > 0) {
				int var6 = var2 + this.field447;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field447 += var2;
				if (this.field443 == -256 && (this.field444 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method935(0, ((RawSound)super.sound).samples, var1, this.field444, var2, this.field451, this.field448, this.field438, this.field452, 0, var6, var3, this);
					} else {
						var2 = method1027(((RawSound)super.sound).samples, var1, this.field444, var2, this.field442, this.field450, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method939(0, 0, ((RawSound)super.sound).samples, var1, this.field444, var2, this.field451, this.field448, this.field438, this.field452, 0, var6, var3, this, this.field443, var5);
				} else {
					var2 = method938(0, 0, ((RawSound)super.sound).samples, var1, this.field444, var2, this.field442, this.field450, 0, var6, var3, this, this.field443, var5);
				}

				this.field447 -= var2;
				if (this.field447 != 0) {
					return var2;
				}

				if (!this.method923()) {
					continue;
				}

				return var4;
			}

			if (this.field443 == -256 && (this.field444 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method967(0, ((RawSound)super.sound).samples, var1, this.field444, var2, this.field451, this.field448, 0, var4, var3, this);
				}

				return method926(((RawSound)super.sound).samples, var1, this.field444, var2, this.field442, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method931(0, 0, ((RawSound)super.sound).samples, var1, this.field444, var2, this.field451, this.field448, 0, var4, var3, this, this.field443, var5);
			}

			return method893(0, 0, ((RawSound)super.sound).samples, var1, this.field444, var2, this.field442, 0, var4, var3, this, this.field443, var5);
		}
	}

	@ObfuscatedName("av")
	boolean method923() {
		int var1 = this.field440;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method896(var1, this.field441);
			var3 = method894(var1, this.field441);
		}

		if (var1 == this.field442 && var2 == this.field451 && var3 == this.field448) {
			if (this.field440 == Integer.MIN_VALUE) {
				this.field440 = 0;
				this.field448 = 0;
				this.field451 = 0;
				this.field442 = 0;
				this.remove();
				return true;
			} else {
				this.method899();
				return false;
			}
		} else {
			if (this.field442 < var1) {
				this.field450 = 1;
				this.field447 = var1 - this.field442;
			} else if (this.field442 > var1) {
				this.field450 = -1;
				this.field447 = this.field442 - var1;
			} else {
				this.field450 = 0;
			}

			if (this.field451 < var2) {
				this.field438 = 1;
				if (this.field447 == 0 || this.field447 > var2 - this.field451) {
					this.field447 = var2 - this.field451;
				}
			} else if (this.field451 > var2) {
				this.field438 = -1;
				if (this.field447 == 0 || this.field447 > this.field451 - var2) {
					this.field447 = this.field451 - var2;
				}
			} else {
				this.field438 = 0;
			}

			if (this.field448 < var3) {
				this.field452 = 1;
				if (this.field447 == 0 || this.field447 > var3 - this.field448) {
					this.field447 = var3 - this.field448;
				}
			} else if (this.field448 > var3) {
				this.field452 = -1;
				if (this.field447 == 0 || this.field447 > this.field448 - var3) {
					this.field447 = this.field448 - var3;
				}
			} else {
				this.field452 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("f")
	static int method896(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("o")
	static int method894(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Lah;II)Lbk;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(PcmPlayer.field394 * 2205000)), var2 << 6) : null;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(Lah;III)Lbk;"
	)
	public static RawPcmStream method898(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		signature = "([B[IIIIIIILbk;)I"
	)
	static int method924(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var7 - var2) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
		}

		var8.field444 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		signature = "(I[B[IIIIIIIILbk;)I"
	)
	static int method925(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var9 - var3) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field444 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		signature = "([B[IIIIIIILbk;)I"
	)
	static int method926(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
		}

		var8.field444 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		signature = "(I[B[IIIIIIIILbk;)I"
	)
	static int method967(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var3 + var4 - (var9 - 1)) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field444 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		signature = "(II[B[IIIIIIILbk;II)I"
	)
	static int method928(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 257) / var11) > var8) {
			var7 = var8;
		}

		byte var13;
		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			var13 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 1) / var11) > var8) {
			var7 = var8;
		}

		for (var1 = var12; var5 < var7; var4 += var11) {
			var13 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
		}

		var10.field444 = var4;
		return var5;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		signature = "(II[B[IIIIIIIILbk;II)I"
	)
	static int method929(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		byte var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var0 = (var14 << 8) + (var4 & 255) * (var2[var1 + 1] - var14);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field444 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		signature = "(II[B[IIIIIIILbk;II)I"
	)
	static int method893(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 + 256 - var4)) / var11) > var8) {
			var7 = var8;
		}

		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			byte var13 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4)) / var11) > var8) {
			var7 = var8;
		}

		var0 = var12;

		for (var1 = var11; var5 < var7; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
		}

		var10.field444 = var4;
		return var5;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		signature = "(II[B[IIIIIIIILbk;II)I"
	)
	static int method931(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var0 = (var2[var1] - var14) * (var4 & 255) + (var14 << 8);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field444 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		signature = "([B[IIIIIIIILbk;)I"
	)
	static int method932(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field451 += var9.field438 * (var6 - var3);
		var9.field448 += var9.field452 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		var9.field442 = var4 >> 2;
		var9.field444 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		signature = "(I[B[IIIIIIIIIILbk;)I"
	)
	static int method933(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field442 += var12.field450 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.field451 = var5 >> 2;
		var12.field448 = var6 >> 2;
		var12.field444 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		signature = "([B[IIIIIIIILbk;)I"
	)
	static int method1027(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field451 += var9.field438 * (var6 - var3);
		var9.field448 += var9.field452 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		var9.field442 = var4 >> 2;
		var9.field444 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		signature = "(I[B[IIIIIIIIIILbk;)I"
	)
	static int method935(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field442 += var12.field450 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.field451 = var5 >> 2;
		var12.field448 = var6 >> 2;
		var12.field444 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		signature = "(II[B[IIIIIIIILbk;II)I"
	)
	static int method936(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field451 -= var11.field438 * var5;
		var11.field448 -= var11.field452 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		byte var14;
		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.field451 += var11.field438 * var5;
		var11.field448 += var11.field452 * var5;
		var11.field442 = var6;
		var11.field444 = var4;
		return var5;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		signature = "(II[B[IIIIIIIIIILbk;II)I"
	)
	static int method1008(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field442 -= var5 * var13.field450;
		if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		byte var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			var16 = var2[var1];
			var0 = (var16 << 8) + (var4 & 255) * (var2[var1 + 1] - var16);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var16 = var2[var4 >> 8];
			var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field442 += var13.field450 * var5;
		var13.field451 = var6;
		var13.field448 = var7;
		var13.field444 = var4;
		return var5;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		signature = "(II[B[IIIIIIIILbk;II)I"
	)
	static int method938(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field451 -= var11.field438 * var5;
		var11.field448 -= var11.field452 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var0 = var13;

		for (var1 = var12; var5 < var8; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.field451 += var11.field438 * var5;
		var11.field448 += var11.field452 * var5;
		var11.field442 = var6;
		var11.field444 = var4;
		return var5;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		signature = "(II[B[IIIIIIIIIILbk;II)I"
	)
	static int method939(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field442 -= var5 * var13.field450;
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			byte var16 = var2[var1 - 1];
			var0 = (var2[var1] - var16) * (var4 & 255) + (var16 << 8);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field442 += var13.field450 * var5;
		var13.field451 = var6;
		var13.field448 = var7;
		var13.field444 = var4;
		return var5;
	}
}
